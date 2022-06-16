package medium.uniquePaths;
//https://leetcode.com/problems/unique-paths/

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dpGrid = new int[m+1][n+1];
        for(int row = 1; row <= m; row++){
            for(int col = 1; col <=n; col++){
                dpGrid[row][col] = Math.max(1, dpGrid[row][col-1] + dpGrid[row-1][col]);
            }
        }
        return dpGrid[m][n];
    }
}
