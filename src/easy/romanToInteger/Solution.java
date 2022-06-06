package easy.romanToInteger;
import java.util.Map;

public class Solution {
    private final Map<String, Integer> numeralValues = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );
    public int romanToInt(String s) {
        int result = 0;
        for(int index = 0; index < s.length(); index++){
            if(index + 1 < s.length() && (numeralValues.get(String.valueOf(s.charAt(index))) < numeralValues.get(String.valueOf(s.charAt(index+1))))){
                //lower value numeral is to the left, compute result
                result += numeralValues.get(String.valueOf(s.charAt(index+1)))-numeralValues.get(String.valueOf(s.charAt(index)));
                //skip an index as already used in calculation
                index++;
            }else{
                result += numeralValues.get(String.valueOf(s.charAt(index)));
            }
        }//end of for loop
        return result;
    }

}

