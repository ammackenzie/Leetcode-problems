package medium.containerWithMostWater;
//https://leetcode.com/problems/container-with-most-water/

public class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int size = height.length;
        int l=0;
        int r = size-1;
        while(r >= l+1){
            max = Math.max(max, (Math.min(height[l], height[r])*(r-l)));
            if(height[l] > height[r]){
                r--;
            }else{
                l++;
            }
        }
        return max;
    }
}
