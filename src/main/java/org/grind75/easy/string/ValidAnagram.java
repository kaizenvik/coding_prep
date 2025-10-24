package org.grind75.easy.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            Integer i = map.getOrDefault(c, 0);
            map.put(c, i+1);
        }

        for(Character c : t.toCharArray()){
            Integer i = map.getOrDefault(c, 0);
            if(i == 0){
                return false;
            } else {
                if(i == 1){
                    map.remove(c);
                } else {
                    map.put(c, i-1);
                }
            }
        }
        return map.isEmpty();
    }
}
