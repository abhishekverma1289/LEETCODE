class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int num: nums){
            sum += num;

            maxSum = Math.max(sum , maxSum);
            sum = Math.max(0 , sum);
        }
        return maxSum;
    }
}