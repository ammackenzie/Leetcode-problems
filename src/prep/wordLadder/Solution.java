package prep.wordLadder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        ArrayList<String> newWordList = new ArrayList<>(wordList);
        boolean trimmed = false;
        for(String word : wordList){
            if(canMutate(beginWord, word)){
                newWordList.remove(word);
            }
        }

        for(String word : wordList){
            if(canMutate(endWord, word)){
                newWordList.remove(word);
                trimmed = true;
            }
        }

        return newWordList.size() + 1 + (trimmed ? 1 : 0);
    }

    private boolean canMutate(String one, String two){
        int indexMatches = 0;
        for(int c= 0 ; c < one.length(); c++){
            if(one.charAt(c) == two.charAt(c)){
                indexMatches++;
            }
        }
        return indexMatches==one.length()-1;
    }

}
