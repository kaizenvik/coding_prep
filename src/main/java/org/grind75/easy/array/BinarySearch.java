package org.grind75.easy.array;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] == target){
                return m;
            }
            if(nums[m] > target){
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public int rSearch(int[] nums, int target, int l, int r) {
        if(l > r){
            return -1;
        }
        int m = l + (r - l) / 2;
        if(nums[m] == target){
            return m;
        }
        if(nums[m] > target){
            return rSearch(nums, target, l, m - 1);
        } else {
            return rSearch(nums, target, m + 1, r);
        }
    }



}
