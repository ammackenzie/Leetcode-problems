package medium.minMoves2;
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int minMoves2(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int l=0, r=nums.length-1;
        while(l <= r){
            moves += Math.abs(nums[l]-nums[r]);
            l++;
            r--;
        }
        return moves;
    }
}
