package prep.longestSubstringWithoutRepeatingChars;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max = Math.max(max, r-l +1);
            }else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l++));
                }
                set.add(s.charAt(r));
            }
        }

        return max;
    }
}
