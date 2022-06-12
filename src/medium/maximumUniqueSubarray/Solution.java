package medium.maximumUniqueSubarray;

import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/maximum-erasure-value/
public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> previousNums = new HashMap<>();
        int[] runningSum = new int[nums.length+1];
        int maxSum = 0;
        for(int r = 0, l=0; r < nums.length;r++){
            //log the current sum in next index of running sums
            runningSum[r+1] = runningSum[r] + nums[r];
            if(previousNums.containsKey(nums[r])){
                //dup found, if within current search range, move l to next search start
                l = Math.max(l, previousNums.get(nums[r])+1);
            }
            maxSum = Math.max(maxSum, runningSum[r+1] - runningSum[l]);
            previousNums.put(nums[r], r);
        }
        return maxSum;
    }
}
