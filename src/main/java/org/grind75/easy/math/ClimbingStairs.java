package org.grind75.easy.math;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public int climbStairsF(int n) {
        // Fibbonachi
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 3;
        int p = 3, pp = 2;
        for(int i = 4 ; i <= n; i++){
            int cc = p + pp;
            pp = p;
            p = cc;
        }
        return p;
    }
}
