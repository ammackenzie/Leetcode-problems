package main;

import medium.suggestedProducts.Solution;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeSet<Character> test = new TreeSet<>();
        test.add('9');
        test.add('1');
        test.add('7');
        test.add('2');

        while(test.size()>0){
            System.out.println(test.last());
        }

    }

}
