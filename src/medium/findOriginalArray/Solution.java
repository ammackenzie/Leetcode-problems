package medium.findOriginalArray;

import javax.swing.table.TableRowSorter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] findOriginalArray(int[] A) {
        int length = A.length, i=0;
        if(length%2==1)return new int[0];
        TreeMap<Integer, Integer> count = new TreeMap<>();
        int[] result = new int[length/2];
        for(int first : A){
            count.put(first, count.getOrDefault(first, 0)+1);
        }
        for(int second : count.keySet()){
            if(count.get(second) > count.getOrDefault(second+second, 0)){
                return new int[0];
            }
            for(int j=0; j < count.get(second); j++){
                result[i++] = second;
                count.put(second+second, count.get(second+second)-1);
            }
        }
        return result;
    }
}
