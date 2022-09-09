package hard.candy;
//https://leetcode.com/problems/candy/

import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int size = ratings.length;
        if(size==0) return 1;
        int[] left = new int[size];
        int[] right = new int[size];
        //left loop through
        for(int i =1; i < size; i++){
            if(ratings[i-1] < ratings[i]){
                left[i] = left[i-1]+1;
            }
        }
        for(int i =size-2; i >= 0; i--){
            if(ratings[i+1] < ratings[i]){
                right[i] = right[i+1]+1;
            }
        }
        for(int n = 0; n < ratings.length; n++){
            size += Math.max(left[n], right[n]);
        }
        return size;
    }
}
