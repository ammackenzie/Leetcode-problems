package Hackerrank.bfsExample;
import java.util.*;

import static java.util.stream.Collectors.joining;
//mock test from https://www.hackerrank.com/interview/preparation-kits/one-week-preparation-kit/one-week-day-six/challenges

public class Result {

    /*
     * Complete the 'bfs' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. 2D_INTEGER_ARRAY edges
     *  4. INTEGER s
     */

    /*public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        int[] distances = new int[n+1];
        distances[0]=-1;
        distances[s]=-1;
        LinkedList<LinkedList<Integer>> graph = new LinkedList<>();
        //populate graph
        for(int i=0;i<=n;i++){graph.add(new LinkedList<>());}
        for(List<Integer> edge : edges){
            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(s);//start with s node
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                int current = queue.poll();
                for(int edge : graph.get(current)){
                    if(distances[edge]==0){ //valid to traverse and has not been visited yet
                        distances[edge] = level; //current number of edges away from starting node
                        queue.offer(edge);
                    }
                }
            }

        }
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(i==s) continue;
            if(distances[i]!=0) answer.add(distances[i]*6);
            else answer.add(-1);
        }
        return answer;
    }*/

    //array based graph
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        int[] distances = new int[n+1];
        distances[0]=-1;
        distances[s]=-1;
        int[][] graph = new int[n+1][n+1];
        //populate graph
        for(List<Integer> edge : edges){
            graph[edge.get(0)][edge.get(1)] = 1;
            graph[edge.get(1)][edge.get(0)] = 1;
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(s);//start with s node
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                int current = queue.poll();
                for(int j=1; j<=n; j++){
                    if(graph[current][j] != 0){
                        //we have found an edge
                        if(distances[j]==0){ //valid to traverse and has not been visited yet
                            distances[j] = level; //current number of edges away from starting node
                            queue.offer(j);
                        }
                    }
                }
            }

        }
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(i==s) continue;
            if(distances[i]!=0) answer.add(distances[i]*6);
            else answer.add(-1);
        }
        return answer;
    }

    /*  int n = 5;
        int m = 3;
        List<List<Integer>> edges = new LinkedList<>();
        List<Integer> one = new LinkedList<>(Arrays.asList(1, 2));
        List<Integer> two = new LinkedList<>(Arrays.asList(1, 3));
        List<Integer> three = new LinkedList<>(Arrays.asList(3, 4));
        edges.add(one);
        edges.add(two);
        edges.add(three);
        int s = 3;
        /*int n = 3;
        int m = 1;
        List<List<Integer>> edges = new LinkedList<>();
        List<Integer> one = new LinkedList<>(Arrays.asList(2, 3));
        edges.add(one);
        int s = 2;*/
        /*int n = 4;
        int m = 2;
        List<List<Integer>> edges = new LinkedList<>();
        List<Integer> one = new LinkedList<>(Arrays.asList(1, 2));
        List<Integer> two = new LinkedList<>(Arrays.asList(1, 3));
        edges.add(one);
        edges.add(two);
        int s = 1;
        for(int i: Result.bfs(n, m, edges, s)){
        System.out.println(i);
    }*/















    /*public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        int[] levelArray = new int[n+1];

        levelArray[0] = -1;
        levelArray[s] = -1;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n+1;i++) graph.add(new ArrayList<>());
        for(List<Integer> edge: edges) {
            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(s);
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                int cur = queue.poll();
                for(int next: graph.get(cur)){
                    if(levelArray[next]==0){
                        levelArray[next] = level;
                        queue.offer(next);
                    }
                }
            }
        }
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(i==s) continue;
            if(levelArray[i]!=0) answer.add(levelArray[i]*6);
            else answer.add(-1);
        }
        return answer;
    }*/
}
