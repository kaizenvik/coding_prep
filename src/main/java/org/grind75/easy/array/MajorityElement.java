package org.grind75.easy.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
//    public int majorityElement(int[] nums) {
//        int count = 0;
//        Integer candidate = null;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            count += (num == candidate) ? 1 : -1;
//        }
//
//        return candidate;
//    }

//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> count = new HashMap<>();
//        int k = 0, v = 0;
//        for (int i : nums){
//            int value = count.getOrDefault(i, 0) + 1;
//            if(k<value){
//                k = value;
//                v = i;
//            }
//            count.put(i, value);
//        }
//        return v;
//    }

    public int majorityElement(int[] nums) {
        Integer candidate = null, count = 0;
        for (int i : nums) {
            if (count == 0)
                candidate = i;
            count += (candidate == i) ? 1 : -1;
        }
        return candidate;
    }
}
