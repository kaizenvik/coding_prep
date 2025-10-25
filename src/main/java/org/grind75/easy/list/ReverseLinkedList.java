package org.grind75.easy.list;

public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

//    public ListNode reverseList(ListNode head) {
//        if (head == null){
//            return head;
//        }
//
//        ListNode x = null;
//        ListNode y = head;
//
//        while (y.next != null){
//            ListNode temp = y.next;
//            y.next = x;
//            x = y;
//            y = temp;
//        }
//        y.next = x;
//        return y;
//    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head, prev = null, next = curr.next;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
