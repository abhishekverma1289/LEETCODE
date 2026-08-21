class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int currentHigh = prices[n-1];
        int maxProfit = 0;

        for(int i = n - 1; i>=0; i--){
            int profit = currentHigh - prices[i];

            if(profit > maxProfit) maxProfit = profit;
            if(prices[i] > currentHigh) currentHigh = prices[i];
        }
        return maxProfit;
    }
}