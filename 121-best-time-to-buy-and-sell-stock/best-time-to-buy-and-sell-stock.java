class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int currentMax = prices[n-1];
        int maxProfit = 0;

        for(int i=n-1 ; i>=0; i--){
            int currentProfit = currentMax - prices[i];
            maxProfit = Math.max(currentProfit , maxProfit);
            currentMax = Math.max(prices[i] , currentMax);
        }
        return maxProfit;
    }
}