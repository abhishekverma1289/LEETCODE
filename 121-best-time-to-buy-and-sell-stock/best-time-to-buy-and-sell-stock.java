class Solution {
    public int maxProfit(int[] prices) {
       int[] maxRight = new int[prices.length];
       int lastHigh = prices[prices.length-1];
       int maxProfit = 0;

       for(int i = prices.length-1; i >= 0; i--){
            int profit = lastHigh - prices[i];
            if(maxProfit < profit) maxProfit = profit;

            if(prices[i] > lastHigh) lastHigh = prices[i];
            maxRight[i] = lastHigh;
       } 
       /*for(int i=0; i<prices.length; i++){
            int profit = maxRight[i] - prices[i];
            if(maxProfit < profit) maxProfit = profit;
       }*/
       return maxProfit;
    }
}