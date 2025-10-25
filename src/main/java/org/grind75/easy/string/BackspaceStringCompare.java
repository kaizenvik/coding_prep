package org.grind75.easy.string;

import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public boolean backspaceCompare1(String s, String t) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> ts = new Stack<>();
        for(Character c: s.toCharArray()){
            if(c == '#'){
                if(!ss.isEmpty())
                    ss.pop();
            }else {
                ss.push(c);
            }
        }
        for(Character c: t.toCharArray()){
            if(c == '#'){
                if(!ts.isEmpty())
                    ts.pop();
            }else {
                ts.push(c);
            }
        }
        while(!ss.isEmpty() && !ts.isEmpty()){
            if(ss.pop() != ts.pop())
                return false;
        }
        return ss.isEmpty() && ts.isEmpty();
    }
}
