class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while(end < nums.length){
            sum += nums[end];

            while(sum >= target){
                minLength = Math.min(minLength , end - start + 1);

                if(start >= nums.length) break;
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        else return minLength;
    }
}