package medium.addTwoNumbers;

import java.util.LinkedList;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode origin = new ListNode();
        ListNode current = origin;
        int remainder = 0;

        while (l1 !=null || l2 != null || remainder != 0){
            if(l1 != null){ remainder += l1.val; l1 = l1.next; }
            if(l2 != null){ remainder += l2.val; l2 = l2.next; }
            current.next = new ListNode(remainder % 10);
            current = current.next;

            remainder /= 10;
        }
        return origin.next;
    }




}