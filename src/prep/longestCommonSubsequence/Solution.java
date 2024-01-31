package prep.longestCommonSubsequence;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        int[][] grid = new int[length1 + 1][length2 + 1];

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    grid[i + 1][j + 1] = grid[i][j] + 1;
                } else {
                    grid[i + 1][j + 1] = Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }

        return grid[length1][length2];
    }
}
