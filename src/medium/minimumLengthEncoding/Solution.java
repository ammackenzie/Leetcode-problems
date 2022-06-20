package medium.minimumLengthEncoding;

import java.util.HashSet;

public class Solution {
    public int minimumLengthEncoding(String[] words) {
        //add array to set
        HashSet<String> set = new HashSet<>();
        for(String word : words){
            set.add(word);
        }

        //iterate through each word, remove each possible substring from set
        for(String word : words){
            //start at index 1 as index 0 substring is the full word itself
            for(int c=1; c < word.length(); c++){
                set.remove(word.substring(c));
            }
        }
        //total up length of all remaining words, plus necessary #
        int total = 0;
        for(String word: set){
            total += word.length() + 1;
        }
        return total;
    }
}
