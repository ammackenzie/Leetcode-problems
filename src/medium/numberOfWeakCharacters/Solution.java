package medium.numberOfWeakCharacters;

import java.util.Arrays;

//https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/
public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {

        // sorting
        int n = properties.length;
        int count = 0;

        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);
        for(int i =0; i< properties.length; i++){
            System.out.println(properties[i][0] + ", " + properties[i][1]);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {

            if (properties[i][1] < max) {
                count++;
            }
            max = Math.max(max, properties[i][1]);
        }
        return count;
    }
}
