package org.grind75.easy.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int sum = 0, curr = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = romanValues.get(s.charAt(i));
            if (val < curr) {
                sum -= val;
            } else {
                sum += val;
                curr = val;
            }
        }
        return sum;
    }
}