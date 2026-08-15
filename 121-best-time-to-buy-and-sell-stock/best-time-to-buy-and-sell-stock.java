class Solution {
    public int maxProfit(int[] prices) {
       int[] maxHigh = new int[prices.length];
       int lastHigh = Integer.MIN_VALUE;
       int maxProfit = 0;

       for(int i = prices.length-1; i >= 0; i--){
            if(prices[i] > lastHigh) lastHigh = prices[i];
            maxHigh[i] = lastHigh;
       } 
       for(int i=0; i<prices.length; i++){
            int profit = maxHigh[i] - prices[i];
            if(maxProfit < profit) maxProfit = profit;
       }
       return maxProfit;
    }
}