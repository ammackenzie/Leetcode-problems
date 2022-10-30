package main;




import Hackerrank.bfsExample.Result;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int n = 5;
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
        int s = 1;*/
        for(int i: Result.bfs(n, m, edges, s)){
            System.out.println(i);
        }
    }



}
