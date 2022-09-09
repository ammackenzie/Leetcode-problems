package easy.maximumUnits;
//https://leetcode.com/problems/maximum-units-on-a-truck/

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0;
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));
        for(int i=boxTypes.length-1; i >=0; i--){
            int boxes = boxTypes[i][0];
            while(boxes > 0 && truckSize > 0){
                units += boxTypes[i][1];
                boxes--;
                truckSize--;
            }
        }
        return units;
    }
}
