package org.grind75.easy.string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magMap = new HashMap<>();
        for (Character cm : magazine.toCharArray()){
            magMap.put(cm, magMap.getOrDefault(cm, 0)+1);
        }

        for (Character cr : ransomNote.toCharArray()){
            Integer chars = magMap.getOrDefault(cr, 0);
            if(chars <= 0){
                return false;
            } else {
                magMap.put(cr, chars-1);
            }
        }
        return true;
    }
}
