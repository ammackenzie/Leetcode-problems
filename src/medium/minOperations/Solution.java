package medium.minOperations;
//https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/

public class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        //find max length of elements that add up to sum - x
        //then can determine min entries that add up to x
        int maxLength = -1;
        int total = 0;
        for(int l=0, r=0; r < nums.length; r++){
            total += nums[r];
            //check if we have exceeded and if so, move l to the right and reduce total
            while(l <= r && total > sum-x){
                total -= nums[l++];
            }
            //if solution found, record
            if(total == sum - x){
                maxLength = Math.max(maxLength, r-l+1);
            }
        }
        return maxLength==-1? -1: nums.length-maxLength;
    }
}
