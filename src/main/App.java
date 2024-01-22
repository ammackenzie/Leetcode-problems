package main;


import youtube.graphs.Solution;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.populateMatrix();
        solution.printMatrix();
        solution.populateAdjacencyList();
        solution.printAdjacencyList();
        solution.startDfsWithAdjacencyList("PHX", "BKK");
    }
}