package medium.minPathSum;
//https://leetcode.com/problems/minimum-path-sum/

public class Solution {
    public int minPathSum(int[][] grid) {
        int h = grid.length;
        int w = grid[0].length;
        for(int row=0; row < h; row++){
            for(int col=0; col < w; col ++){
                if(row == 0 && col == 0) continue;
                if(row == 0){grid[row][col] += grid[row][col - 1]; continue;}
                if(col == 0){grid[row][col] += grid[row - 1][col]; continue;}
                grid[row][col] += Math.min(grid[row - 1][col], grid[row][col - 1]);
            }
        }
        return grid[h-1][w-1];
    }
    private void printDp(int[][] dp){
        String grid = "";
        for(int i = 0; i < dp.length; i++){
            grid += "|";
            for(int j = 0; j < dp[0].length; j++){
                grid += dp[i][j] + "|";
            }
            grid +="\n";
        }
        System.out.println(grid);
    }
}
