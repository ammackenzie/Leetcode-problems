package main;



import medium.maximumUniqueSubarray.Solution;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] input = new int[]{187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        int[] input = new int[]{4,2,4,5,6};
        System.out.println(solution.maximumUniqueSubarray(input));
        int total = 0;
        for(int num: input){
            total+= num;
        }
        System.out.println(""+total);

    }

}
