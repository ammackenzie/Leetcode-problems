package medium.lengthOfLongestSubstring;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int currentLen = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i < s.length(); i++, currentLen++){
            Character c = s.charAt(i);
            Integer prevPosition = map.get(c);
            if(prevPosition!=null){
                //found a previously seen char
                if(prevPosition >= start){
                    //the dup char was found later in the string than the current start position
                    //therefore chance a new maxlen has been found
                    start = prevPosition+1; //new start point should be one ahead of where the dup was previously found
                    if(maxLen < currentLen){
                        maxLen = currentLen;
                    }
                    //update currentlen
                    currentLen = i - start;
                }
            }
            map.put(c, i);
        }
        if(currentLen > maxLen){ maxLen = currentLen;  }
        return maxLen;
    }
}
