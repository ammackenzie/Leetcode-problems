package medium.kthLargestNumber;
//https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/

import java.util.PriorityQueue;

public class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> largest = new PriorityQueue<>(
                ((o1, o2) -> {
                   if(o1.length() == o2.length()){
                       return o1.compareTo(o2);
                   }
                   return Integer.compare(o1.length(), o2.length());
                })
        );
        for(String num: nums){
            largest.offer(num);
            if(largest.size() > k){
                largest.poll();
            }
        }
        return largest.poll();
    }
}
