package main;

import medium.suggestedProducts.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PriorityQueue<Integer> test = new PriorityQueue<>((a,b) -> a-b);
        test.offer(10);
        test.offer(1);
        test.offer(5);
        test.offer(20);

        while(test.size()>0){
            System.out.println(test.poll());
        }

    }

}
