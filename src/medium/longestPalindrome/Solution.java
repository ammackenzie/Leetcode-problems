package medium.longestPalindrome;
//https://leetcode.com/problems/longest-palindromic-substring/submissions/
public class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0, currentLen = 0;
        int startIndex = 0;
        for(int i=0; i < s.length(); i++){
            //check both odd and even directions for palindromes
            currentLen = Math.max(getNextPalindromeLength(s, i, i), getNextPalindromeLength(s,i, i+1));
            if(currentLen > maxLen){
                //record best len and starting index
                startIndex = i - (currentLen-1)/2;
                maxLen = currentLen;
            }
        }
        //use starting index of best len to slice string
        return s.substring(startIndex, startIndex + maxLen);
    }

    public int getNextPalindromeLength(String input, int l, int r){
        while(l >=0 && r < input.length() && input.charAt(l)==input.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}
