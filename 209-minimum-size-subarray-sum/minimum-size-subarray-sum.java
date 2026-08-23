class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        while(end < n){
            sum += nums[end];

            while(sum >= target){
                minLength = Math.min(end - start + 1, minLength);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if(minLength != Integer.MAX_VALUE) return minLength;
        else return 0;
    }
}