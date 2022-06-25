package medium.NonDecreasingArray;
//https://leetcode.com/problems/non-decreasing-array/

public class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean changed = false;
        for(int i=1; i < nums.length-1; i++){
            if(nums[i-1] > nums[i]){
                if(changed) return false;
                else{
                    changed = true;
                    if(i-2 < 0 || nums[i-2] >= nums[i]){
                        nums[i] = nums[i-1];
                    }else{
                        nums[i-1] = nums[i];
                    }
                }
            }
        }
        return true;
    }
}
