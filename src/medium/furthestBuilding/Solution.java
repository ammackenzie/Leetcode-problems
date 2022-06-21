package medium.furthestBuilding;
//https://leetcode.com/problems/furthest-building-you-can-reach/

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> climbs = new PriorityQueue<>();
        for(int i=0; i<heights.length-2; i++){
            int diff = heights[i+1]-heights[i];
            if(diff > 0){
                //we need to use a resource
                climbs.add(diff);
            }
            if(climbs.size() > ladders){
                //need to remove bricks
                bricks -= climbs.poll();
            }
            if(bricks <=0){
                //all bricks and ladders used
                return i;
            }
        }
        return heights.length-1;
    }
}
