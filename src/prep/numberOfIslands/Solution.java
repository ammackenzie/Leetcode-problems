package prep.numberOfIslands;

public class Solution {

    int length = 0;
    int width = 0;

    public int numIslands(char[][] grid) {

        length = grid.length;
        if(length >0){
            width = grid[0].length;
        }
        int count = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j ++){
                if(grid[i][j] == '1'){
                    count++;
                    busterCall(grid, i, j);
                }
            }
        }

        return count;

    }

    private void busterCall(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || (i >= length) || (j >= width) || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        busterCall(grid, i+1, j);
        busterCall(grid, i-1, j);
        busterCall(grid, i, j+1);
        busterCall(grid, i, j-1);
    }
}
