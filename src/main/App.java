package main;

import easy.mergeSortedArray.Solution;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        solution.mergeFast(nums1, 3, nums2, 3);
        for(int num : nums1){
            System.out.println(""+num);
        }
    }

}
