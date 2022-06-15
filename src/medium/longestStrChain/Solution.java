package medium.longestStrChain;
//https://leetcode.com/problems/longest-string-chain/

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length()-b.length());
        HashMap<String, Integer> dp = new HashMap<>();
        int maxCount = 0;
        for(String word : words){
            int currentCount = 0;
            for(int i=0; i < word.length(); i++){
                String previous = word.substring(0, i) + word.substring(i+1);
                currentCount = Math.max(currentCount, dp.getOrDefault(previous, 0)+1);
            }
            dp.put(word, currentCount);
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
}
