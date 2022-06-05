package easy.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Solution() {}
    public int[] twoSum(int[] nums, int target) {
        //iterate through array
        for(int outerCounter = 0 ; outerCounter < nums.length ; outerCounter++) {
            for(int innerCounter = outerCounter+1 ; innerCounter < nums.length ; innerCounter++) {
                if((nums[outerCounter] + nums[innerCounter]) == target){
                    return new int[] {outerCounter, innerCounter};
                }
            }//end of inner loop
        }//end of outer loop
        return null;
    }

    //for reference have included solution from leetcode that trades memory for greater speed
    //takes from O(n^2) to O(n)
    public int[] twoSumViaMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

}
