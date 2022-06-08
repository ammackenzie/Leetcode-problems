package main;


import medium.addTwoNumbers.ListNode;
import medium.addTwoNumbers.Solution;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(9);
        //l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode l3 = solution.addTwoNumbers(l1, l2);

        /*ListNode l1 = new ListNode(5, new ListNode(6));
        //l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5, new ListNode(4));
        l2.next.next = new ListNode(9);
        ListNode l3 = solution.addTwoNumbers(l1, l2);*/

        /* ListNode l1 = new ListNode(2, new ListNode(4));
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5, new ListNode(6));
        l2.next.next = new ListNode(4);
        ListNode l3 = solution.addTwoNumbers(l1, l2);*/
        while(l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

}
