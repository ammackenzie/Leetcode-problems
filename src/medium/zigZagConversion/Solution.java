package medium.zigZagConversion;
//https://leetcode.com/problems/zigzag-conversion/

public class Solution {
    public String convert(String s, int numRows) {
        String[] outputStrs = new String[numRows];
        for(int i=0; i< numRows; i++){
            outputStrs[i] = "";
        }
        int size = s.length();
        int i = 0;
        while(i < size){
            //add vertically down
            for(int row = 0; row < numRows && i < size; row++){
                outputStrs[row] += s.charAt(i++);
            }
            //diagonally up
            //we always start at row one up from bottom and stop one down from top
            for(int row = numRows-2; row >= 1 && i < size; row--){
                outputStrs[row] += s.charAt(i++);
            }
        }
        String output = "";
        for(int rowStr=0; rowStr < numRows; rowStr++){
            output += outputStrs[rowStr];
        }
        return output;
    }

    public String convertCycleMethod(String s, int nRows) {
        StringBuilder sb = new StringBuilder();
        if (nRows <= 1) { return s; }
        int cycle = 2 * (nRows - 1);
        for (int i = 0, offset = cycle; i < nRows; ++i, offset -= 2) {
            for (int j = i; j < s.length(); j += cycle) {
                sb.append(s.charAt(j));
                if (offset % cycle != 0 && j + offset < s.length()) {
                    sb.append(s.charAt(j + offset));
                }
            }
        }
        return sb.toString();
    }

}
