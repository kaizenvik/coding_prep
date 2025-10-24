package org.grind75.easy.array;

import java.util.Random;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int s = 0, e = n, p = s + (e - s) / 2;
        while (s <= e) {
            boolean cVersion = !isBadVersion(p);
            boolean pVersion = !isBadVersion(p - 1);
            if (!cVersion && pVersion) {
                return p;
            }
            if (cVersion && pVersion) { // go right
                s = p + 1;
                p = s + (e - s) / 2;
            }

            if (!cVersion && !pVersion) { // go left
                e = p - 1;
                p = s + (e - s) / 2;
            }
        }
        return -1;
    }

    private boolean isBadVersion(int p) {
        return new Random().nextInt(p + 1) % 2 == 0;
    }


//    public int firstBadVersion(int n) {
//        int l = 0, r = n;
//        while(l <= r){
//            int m = l + (r-l)/2;
//
//            if(isBadVersion(m)){
//                if(!isBadVersion(m-1)){
//                    return m;
//                }
//                r = m-1;
//            } else {
//                l = m + 1;
//            }
//        }
//        return -1;
//    }

//        public int firstBadVersion(int n) {
//        int l = 0, r = n;
//        while(l <= r){
//            int m = l + (r-l)/2;
//
//            if(isBadVersion(m)){
//                r = m-1;
//            } else {
//                l = m + 1;
//            }
//        }
//        return l;
    }
}
