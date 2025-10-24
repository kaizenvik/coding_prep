package org.grind75.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    /**
     if next bracket is
     open  - Push to stack
     close
     - Stack empty - > false
     - stack.top()
     -  close -> push
     -   open -> pop
     */
    public boolean isValid(String s) {
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put(']', '[');
        bracket.put(')', '(');
        bracket.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(bracket.get(c) != null){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == bracket.get(c)){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
