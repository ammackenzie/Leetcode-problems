package easy.pallindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String stringInput = String.valueOf(x);
        int start = 0;
        int end = stringInput.length()-1;
        while(start < end){
            if(stringInput.charAt(end--) != stringInput.charAt(start++)){
                return false;
            }
        }
        return true;
    }
}
