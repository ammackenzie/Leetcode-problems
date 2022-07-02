package medium.maxArea;
//https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/

import java.util.Arrays;

public class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxH = Math.max(h - horizontalCuts[horizontalCuts.length-1], horizontalCuts[0]);
        int maxV = Math.max(w - verticalCuts[verticalCuts.length-1], verticalCuts[0]);
        System.out.println("before loops, maxH=" + maxH);
        System.out.println("before loops, maxV" + maxV);
        for(int i=0; i< horizontalCuts.length-1; i++){
            maxH = Math.max(maxH, (horizontalCuts[i+1]-horizontalCuts[i]));
        }
        for(int i=0; i< verticalCuts.length-1; i++){
            maxV = Math.max(maxV, (verticalCuts[i+1]-verticalCuts[i]));
        }
        System.out.println("after loops, maxH=" + maxH);
        System.out.println("after loops, maxV=" + maxV);
        return (int)((long)maxH*maxV % 1000000007);
    }
}
