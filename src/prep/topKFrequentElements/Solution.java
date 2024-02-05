package prep.topKFrequentElements;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key : map.keySet()){
            if(bucket[map.get(key)]==null){
                bucket[map.get(key)] = new ArrayList<>();
            }
            bucket[map.get(key)].add(key);
        }

        int[] res = new int[k];
        int counter = 0;
        for(int i = bucket.length-1; i >= 0; i--){
            for(int key : bucket[i]){
                res[counter++] = key;
            }
        }
        return res;
    }
}
