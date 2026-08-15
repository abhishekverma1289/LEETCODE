//don't create suffixMax , just remember the maxright till point in variable , SufixMax - prices[i] is profit
class Solution {
    public int maxProfit(int[] prices) {
       int lastHigh = prices[prices.length-1];
       int maxProfit = 0;

       for(int i = prices.length-1; i >= 0; i--){
            int profit = lastHigh - prices[i];
            if(maxProfit < profit) maxProfit = profit;

            if(prices[i] > lastHigh) 
            lastHigh = prices[i];
       } 
       return maxProfit;
    }
}