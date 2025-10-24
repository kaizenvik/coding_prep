package org.grind75.easy.array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int min = prices[0];
        for(int i : prices){
            if(i < min){
                min = i;
            }
            maxP = Math.max(maxP, i - min);
        }
        return maxP;
    }
}
