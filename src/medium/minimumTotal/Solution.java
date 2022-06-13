package medium.minimumTotal;

import java.util.List;

public class Solution {
    private Integer[][] memoization;
    public int minimumTotalRecursion(List<List<Integer>> triangle) {
        //top down solution
        int size = triangle.size();
        memoization = new Integer[size][size];
        return depthFirstSearch(0,0,triangle);
    }

    private int depthFirstSearch(int layer, int index, List<List<Integer>> triangle){
        if(memoization[layer][index] != null){ return memoization[layer][index]; }
        int path = triangle.get(layer).get(index);
        if(layer < triangle.size()-1){
            //can continue path
            path += Math.min(depthFirstSearch(layer+1, index, triangle), depthFirstSearch(layer+1, index+1, triangle));
        }
        memoization[layer][index] = path;
        return path;
    }


    public int minimumTotalBottomUp(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dpArray = new int[size+1][size+1];
        for(int layer = size-1; layer >=0; layer--){
            //will always be layer num of elements in each layer (layer index 3 has 3 elements)
            for(int i = 0; i<= layer; i++){
                //store result of combining current location in triangle with min value of previous layer sum
                dpArray[layer][i] = triangle.get(layer).get(i) + Math.min(dpArray[layer+1][i], dpArray[layer+1][i+1]);
            }
        }
        return dpArray[0][0];
    }



}
