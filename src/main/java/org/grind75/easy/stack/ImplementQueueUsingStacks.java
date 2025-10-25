package org.grind75.easy.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    class MyQueue {

        Stack<Integer> A;
        Stack<Integer> B;
        Integer peek;

        public MyQueue() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            if(A.isEmpty()){
                peek = x;
            }
            A.push(x);
        }

        public int pop() {
            while(!A.isEmpty()){
                B.push(A.pop());
            }
            int x = B.pop();
            peek = B.isEmpty()?null:B.peek();
            while(!B.isEmpty()){
                A.push(B.pop());
            }
            return x;
        }

        public int peek() {
            return peek;
        }

        public boolean empty() {
            return A.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
