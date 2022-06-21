package medium.reverseInteger;
//https://leetcode.com/problems/reverse-integer/submissions/

public class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0)
        {
            //extract the last digit
            int tail = x % 10;
            //multiply current result by 10 and add last digit of x
            int newResult = result * 10 + tail;
            //check for overflow
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            //we can now move to the left
            x = x / 10;
        }

        return result;
    }
}
