package easy.intersectionOfTwoLinkedLists;

import java.util.List;

public class Solution {
    public class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        while(currentNodeA != null){
            while(currentNodeB != null){
                if(currentNodeB.equals(currentNodeA)){
                    return currentNodeB;
                }else{
                    currentNodeB = currentNodeB.next;
                }
            }
            currentNodeB = headB;
            currentNodeA = currentNodeA.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeFast(ListNode headA, ListNode headB) {
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        while(currentNodeA != currentNodeB){
            currentNodeA = currentNodeA == null? headB : currentNodeA.next;
            currentNodeB = currentNodeB == null? headA : currentNodeB.next;
        }
        return currentNodeA;
    }

    //generates test data that can be used for debugging
    //will not result in finding a solution
    public ListNode generateTestData(int[] testInputArray){
        ListNode output = new ListNode(testInputArray[0]);
        ListNode currentNode = output;
        for(int index=1; index < testInputArray.length; index++ ){
            currentNode.next =  new ListNode(testInputArray[index]);
            currentNode = currentNode.next;
        }
        return output;
    }
}
