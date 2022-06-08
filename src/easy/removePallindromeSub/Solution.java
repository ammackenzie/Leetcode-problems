package easy.removePallindromeSub;

public class Solution {
    public int removePalindromeSub(String s) {
        for(int index=0; index < s.length(); index++){
            if(!(s.charAt(index) == s.charAt(s.length()-1-index))){
                //not a complete palindrome, will require 2 steps
                return 2;
            }
        }
        //already a complete palindrome, only 1 step required
        return 1;
    }
}
