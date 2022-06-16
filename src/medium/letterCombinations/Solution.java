package medium.letterCombinations;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits.isBlank()){ return list;}
        helper(digits, list, 0, "");
        return list;
    }

    private void helper(String digits, List<String> list, int offset, String str){
        if(offset == digits.length()){
            list.add(str);
            return;
        }
        String available = letters[digits.charAt(offset)-'0'];
        for(int i=0; i< available.length(); i++){
            helper(digits, list, offset+1, str+available.charAt(i));
        }
    }
}
