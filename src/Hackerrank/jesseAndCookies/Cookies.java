package Hackerrank.jesseAndCookies;

import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Cookies {
    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int sweetness : A){
            queue.add(sweetness);
        }
        int operations = 0;
        while(queue.peek() < k && queue.size() > 1){
            int lowest = queue.poll();
            int secondLowest = queue.poll();
            int result = lowest + (2*secondLowest);
            queue.add(result);
            operations++;
        }
        if(queue.peek() >=k){
            return operations;
        }else{
            return -1;
        }
    }
}
