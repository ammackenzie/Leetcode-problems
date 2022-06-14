package medium.minDistance;
//https://leetcode.com/problems/delete-operation-for-two-strings/

public class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        for(int i = 1; i <= word1.length(); i++)
            for(int j = 1; j <= word2.length(); j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        // combined length of both words - double the largest substring returns min operations
        return word1.length() + word2.length() - 2 * dp[word1.length()][word2.length()];
    }
    //for visualising the dp grid
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
