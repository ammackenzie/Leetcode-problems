package Hackerrank.flippingTheMatrix;

import java.util.List;

public class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
/*1
2
112 42 83 119
56 125 56 49
15 78 101 43
62 98 114 108
Your Output (stdout)
335
Expected Output

Download
414*/


        /*
         * Complete the 'flippingMatrix' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
         */

        public static int flippingMatrix(List<List<Integer>> matrix) {
            // Write your code here
            int total = 0;
            int length = matrix.size();
            int n = length/2;
            for(int row=0;row<n;row++){
                for(int col=0;col<n;col++){
                    int current = matrix.get(row).get(col);
                    current = Math.max(current, matrix.get(row).get(length-1-col));
                    current = Math.max(current, matrix.get(length-1-row).get(col));
                    current = Math.max(current, matrix.get(length-1-row).get(length-1-col));
                    total+=current;
                }
            }
            return total;
        }

}