package hard.constructTargetArrayWithMultipleSums;
//https://leetcode.com/problems/construct-target-array-with-multiple-sums/

import java.util.PriorityQueue;

public class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (b - a));
        long total = 0;
        for (int a : target) {
            total += a;
            pq.add(a);
        }
        while (true) {
            int largest = pq.poll();
            total -= largest;
            if (largest == 1 || total == 1)
                return true;
            if (largest < total || total == 0 || largest % total == 0)
                return false;
            largest %= total;
            total += largest;
            pq.add(largest);
        }
    }
}
