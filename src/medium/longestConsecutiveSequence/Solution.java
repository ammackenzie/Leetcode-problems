package medium.longestConsecutiveSequence;
//https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLen=0, currentLen = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                //found a 'low' point in the nums - can now check for a sequence
                int next = num+1;
                currentLen=1;
                while(set.remove(next++)){
                    //using remove here is more optimal than contains as we shorten set by removing redundant entries
                    currentLen++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }

}
