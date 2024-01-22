package youtube.graphs;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Solution {
    public ArrayList<String> airports = new ArrayList<>(List.of(
            "PHX",
            "BKK",
            "OKC",
            "JFK",
            "LAX",
            "MEX",
            "EZE",
            "HEL",
            "LOS",
            "LAP",
            "LIM"));

    public String[][] routes = {
            {"PHX", "LAX"},
            {"PHX", "JFK"},
            {"JFK", "OKC"},
            {"JFK", "HEL"},
            {"JFK", "LOS"},
            {"MEX", "LAX"},
            {"MEX", "BKK"},
            {"MEX", "LIM"},
            {"MEX", "EZE"},
            {"LIM", "BKK"},
    };

    public int[][] matrix;
    public HashMap<String, ArrayList<String>> adjacencyList;


    public void populateMatrix(){
        matrix = new int[airports.size()][airports.size()];
        for(int i = 0; i< routes.length; i++){
            String start = routes[i][0];
            String end = routes[i][1];
            matrix[airports.indexOf(start)][airports.indexOf(end)] = 1;
            matrix[airports.indexOf(end)][airports.indexOf(start)] = 1;
        }

    }

    public void printMatrix(){
        String output = "";
        for(int[] node : matrix){
            for(int connection : node){
                output += "|";
                output += connection;
            }
            output += "|";
            output += "\n";
        }
        System.out.println(output);
    }

    public void printAdjacencyList(){
        String output = "";
        for(String node : adjacencyList.keySet()){
            output += node;
            output += "=>";
            for(String destination : adjacencyList.get(node)){
                output+=destination +", ";
            }
            output += "\n";
        }
        System.out.println(output);
    }

    public void populateAdjacencyList(){
        adjacencyList = new HashMap<>();
        for(String airport : airports){
            adjacencyList.put(airport, new ArrayList<>());
        }
        for(String[] route : routes){
            adjacencyList.get(route[0]).add(route[1]);
            adjacencyList.get(route[1]).add(route[0]);
        }
    }


    public int useMatrixToFindTotalRoutesTo(String destination){
        int indexOfDestination = airports.indexOf(destination);
        int routes = 0;
        for(int[] row : matrix){
            routes += row[indexOfDestination];
        }
        return routes;
    }

    public void findTotalRoutesToDestination(String destination){
        bfsWithAdjacencyList("PHX", destination);
    }

    public void bfsWithAdjacencyList(String start, String targetDestination){
        HashSet<String> visited = new HashSet<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add(start);
        visited.add(start);
        int loopsTillFirstFind=0;
        while(queue.size() > 0){
            System.out.println("queue at start of loop: " + queue.toString());
            String airport = queue.poll();

            ArrayList<String> destinations = adjacencyList.get(airport);
            for(String destination : destinations){
                loopsTillFirstFind++;
                if(destination.equals(targetDestination)){
                    System.out.println("found it!");;
                }
                if(!visited.contains(destination)){
                    visited.add(destination);
                    queue.add(destination);
                    System.out.println(destination);
                }
            }
        }
    }

    public void startDfsWithAdjacencyList(String start, String targetDestination){
        HashSet<String> visited = new HashSet<>();
        visited.add(start);
        dfsWithAdjacencyList(start, targetDestination, visited);
    }

    public void dfsWithAdjacencyList(String start, String targetDestination, HashSet visited){
        System.out.println(start);
        visited.add(start);
        for(String destination : adjacencyList.get(start)){
            if(destination.equals(targetDestination)){
                System.out.println("found it!");
                return;
            }
            if(!visited.contains(destination)){
                dfsWithAdjacencyList(destination, targetDestination, visited);
            }
        }
    }
}
