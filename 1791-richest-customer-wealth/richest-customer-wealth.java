class Solution {
    public int maximumWealth(int[][] accounts) {
        int biggestBalance = Integer.MIN_VALUE;

        for(int i=0; i < accounts.length; i++){
            int balance = 0;
            for(int j=0; j < accounts[i].length; j++){
                balance += accounts[i][j];
            }
            biggestBalance = Math.max(biggestBalance , balance);
        }
        
        return biggestBalance;
    }
}