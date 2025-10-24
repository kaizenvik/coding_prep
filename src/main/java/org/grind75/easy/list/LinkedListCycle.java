package org.grind75.easy.list;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode r = head;
        ListNode t = head;
        if(head == null)
            return false;

        while (r.next != null && r.next.next != null) {
            r = r.next.next;
            t = t.next;
            if (r == t)
                return true;
        }
        return false;
    }

//    public boolean hasCycle(ListNode head) {
//        ListNode a = head, b = head;
//        while(a != null && b != null){
//            a = a.next;
//            b = b.next;
//            if(b != null){
//                b = b.next;
//            } else {
//                return false;
//            }
//
//            if(a == b){
//                return true;
//            }
//        }
//        return false;
//    }
}
