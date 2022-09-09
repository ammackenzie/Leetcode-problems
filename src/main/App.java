package main;



import medium.numberOfWeakCharacters.Solution;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] properties = {{1,5},{10,4},{4,3}, {10, 3}};
        for(int i =0; i< properties.length; i++){
            System.out.println(properties[i][0] + ", " + properties[i][1]);
        }
        System.out.println(solution.numberOfWeakCharacters(properties));
    }

}
