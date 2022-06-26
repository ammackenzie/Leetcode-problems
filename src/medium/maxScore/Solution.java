package medium.maxScore;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lTotal = 0, rTotal = 0;
        for(int l=0; l<=k-1; l++){
            //start with linear left side total
            lTotal+= cardPoints[l];
        }
        int max = lTotal;
        for(int i=0; i<=k-1; i++){
            //swap last left choice for first r choice
            rTotal+= cardPoints[n-1-i];
            lTotal -= cardPoints[k-1-i];
            //check if higher total
            max = Math.max(max, lTotal+rTotal);
        }
        return max;
    }
}
