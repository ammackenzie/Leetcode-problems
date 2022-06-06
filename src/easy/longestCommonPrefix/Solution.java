package easy.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int indexOfShortestEntry = 0;
        String shortestEntry = "";
        for(int index =0; index < strs.length; index++){
            if(strs[index].length() < strs[indexOfShortestEntry].length()){ indexOfShortestEntry = index; }
        }
        shortestEntry = strs[indexOfShortestEntry];
        int sharedChars = shortestEntry.length();
        for(int index =0; index < strs.length; index++){
            if(index != indexOfShortestEntry){
                int currentSharedChars = 0;
                for(int stringIndex=0; stringIndex < shortestEntry.length(); stringIndex++){
                    if(strs[index].substring(0, stringIndex+1).equals(shortestEntry.substring(0, stringIndex+1))){
                        //still matching, increment shared chars
                        currentSharedChars++;
                    }
                }
                //if new least amount of matches found, replace
                if(currentSharedChars < sharedChars){ sharedChars = currentSharedChars; }
            }
        }
        return shortestEntry.substring(0, sharedChars);
    }

    public String longestCommonPrefixFast(String[] strs) {
        String prefix = strs[0];
        for (int index=1; index< strs.length; index++){
            while(strs[index].indexOf(prefix)!=0){
                prefix= prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
