package medium.minDeletions;
//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int minDeletions(String s) {
        int deletions = 0;
        char[] chars = s.toCharArray();
        int[] frequencies = new int[26];
        HashSet<Integer> set = new HashSet<>();
        for(char c : chars){frequencies[c-97] += 1;}
        for(int num : frequencies){
            while(!set.add(num) && num > 0){
                num-=1;
                deletions++;
            }
        }
        return deletions;
    }
}
