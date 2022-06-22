package medium.findKthLargest;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largest = new PriorityQueue<>();
        for(int num : nums){
            largest.offer(num);
            if(largest.size() > k){
                largest.poll();
            }
        }
        return largest.poll();
    }

    public int findKthLargestQS(int[] nums, int k) {
        PriorityQueue<Integer> largest = new PriorityQueue<>();
        for(int num : nums){
            largest.offer(num);
            if(largest.size() > k){
                largest.poll();
            }
        }
        return largest.poll();
    }
}
