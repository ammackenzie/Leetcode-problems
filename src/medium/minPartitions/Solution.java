package medium.minPartitions;
//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

import java.util.TreeSet;

public class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i =0; i< n.length(); i++){
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}
