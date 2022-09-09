package medium.wiggleMaxLength;
//https://leetcode.com/problems/wiggle-subsequence/

public class Solution {
    public int wiggleMaxLength(int[] nums) {
        //[1,3,2,6,4,3,7,2,9]
        int size = nums.length;
        int[] down = new int[size];
        int[] up = new int[size];
        //account for starting index always valid
        down[0] = 1;
        up[0]= 1;
        for(int i = 1;i< size; i++){
            if(nums[i] > nums[i-1]){
                up[i] = down[i-1]+1; //add on to sequence from previous index
                down[i] = down[i-1]; //not valid to increment sequence from previous index
            }else if(nums[i] < nums[i-1]){
                up[i] = up[i-1];
                down[i] = up[i-1]+1;
            }else{
                //same value cannot increment either up or down sequence
                up[i] = up[i-1];
                down[i] = down[i-1];
            }
        }
        return Math.max(down[size-1], up[size-1]);
    }
}
