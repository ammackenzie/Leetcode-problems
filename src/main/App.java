package main;


//import youtube.graphs.Solution;





import prep.wordLadder.Solution;

import java.util.ArrayList;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.populateMatrix();
//        solution.printMatrix();
//        solution.populateAdjacencyList();
//        solution.printAdjacencyList();
//        solution.startDfsWithAdjacencyList("PHX", "BKK");

//        int[] one = {1, 2, 2, 2,2,2,2, 2,  2, 2}, two = {3,4, 8, 11, 45, 6, 7, };
//        hard.findMedianSortedArrays.Solution solution = new hard.findMedianSortedArrays.Solution();
//        System.out.println(solution.findMedianSortedArrays(one, two));

//        int[] ratings = {1,0,2};
//        int[] ratings2 = {1, 2, 2, 2,2,3,4, 2,  2, 2};
//
//        String s = "1";
//
//        Solution solution = new Solution();
//        System.out.println(solution.calculate(s));

        Solution solution = new Solution();
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");


        System.out.println(solution.ladderLength("hit", "cog", wordList));
    }
}