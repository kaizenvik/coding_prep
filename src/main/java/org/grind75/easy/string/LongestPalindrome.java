package org.grind75.easy.string;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }

//    public int longestPalindrome(String s) {
//        int longest = 0;
//        Map<Character, Integer> count = new HashMap<>();
//        for (Character c : s.toCharArray()) {
//            int i = count.getOrDefault(c, 0);
//            if (i == 1) {
//                longest += 2;
//                count.remove(c);
//            } else {
//                count.put(c, 1);
//            }
//        }
//        return longest + (count.isEmpty() ? 0 : 1);
//    }

//    public int longestPalindrome(String s) {
//        int len = 0;
//        Map<Character, Integer> count = new HashMap<>();
//        for(Character c: s.toCharArray()){
//            int i = count.getOrDefault(c, 0);
//            count.put(c, i+1);
//        }
//        for(Map.Entry<Character, Integer> c :  count.entrySet()){
//            Integer value = c.getValue();
//            if(value > 1){
//                len += (value/2)*2;
//            }
//        }
//        if(len < s.length())
//            len++;
//        return len;
//    }
}
