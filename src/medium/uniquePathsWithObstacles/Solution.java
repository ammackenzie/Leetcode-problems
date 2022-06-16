package medium.uniquePathsWithObstacles;
//https://leetcode.com/problems/unique-paths-ii/
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h = obstacleGrid.length;
        int w = obstacleGrid[0].length;
        int[][] dpGrid = new int[h+1][w+1];
        dpGrid[1][1] = 1;
        for(int row = 1; row <= h; row++){
            for(int col = 1; col <=w; col++){
                if(obstacleGrid[row-1][col-1] == 1){
                    //obstacle found
                    dpGrid[row][col] = 0;
                }else{
                    if(row !=1 && col != 1){dpGrid[row][col] = dpGrid[row][col-1] + dpGrid[row-1][col];}
                }
                printDp(dpGrid);
            }
        }
        return dpGrid[h][w];
    }
    private void printDp(int[][] dp){
        String output = "";
        for(int r=0; r < dp.length; r++){
            output+="|";
            for(int c=0; c < dp[0].length; c++){
                output += dp[r][c] + "|";
            }
            output+="\n";
        }
        System.out.println(output);
    }
}
