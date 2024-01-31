package hard.candy;
//https://leetcode.com/problems/candy/

import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int length = ratings.length;

        if(length<=1){
            return 1;
        }
        int[] leftCandies = new int[length];
        int[] rightCandies = new int[length];
        Arrays.fill(leftCandies, 1);
        Arrays.fill(rightCandies, 1);
        for(int l=1; l< length; l++){
            if(ratings[l] > ratings[l-1]){
                leftCandies[l] = leftCandies[l-1]+1;
            }
        }
        for(int r=length-2; r >=0; r--){
            if(ratings[r] > ratings[r+1]){
                leftCandies[r] = leftCandies[r+1]+1;
            }
        }

        int total = 0;
        for(int i = 0; i < length; i++){
            total += Math.max(leftCandies[i], rightCandies[i]);
        }
        return total;
    }
}
