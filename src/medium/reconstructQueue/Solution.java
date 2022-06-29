package medium.reconstructQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/queue-reconstruction-by-height/
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> toReturn = new LinkedList<>();
        Arrays.sort(people,(o1, o2) -> o1[0]==o2[0] ? o1[1]-o2[1]: o2[0]-o1[0]);
        for(int[] cur : people){
            toReturn.add(cur[1], cur);
        }
        return toReturn.toArray(new int[toReturn.size()][2]);
    }
}
