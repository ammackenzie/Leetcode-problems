package easy.validParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesisChars = new Stack<>();
        for(char character : s.toCharArray()){
            if(character=='(' || character=='{' || character=='['){
                parenthesisChars.push(character);
            }else{
                try{
                    switch(character){
                        case ')':
                            if(parenthesisChars.peek().equals('(')){ parenthesisChars.pop(); }
                            else{return false;}
                            break;
                        case '}':
                            if(parenthesisChars.peek().equals('{')){ parenthesisChars.pop(); }
                            else{return false;}
                            break;
                        case ']':
                            if(parenthesisChars.peek().equals('[')){ parenthesisChars.pop(); }
                            else{return false;}
                            break;
                        default:
                            //nothing
                    }//end of switch
                }catch (Exception ex){ return false;}
            }
        }//end of for loop
        return parenthesisChars.isEmpty();
    }
}

