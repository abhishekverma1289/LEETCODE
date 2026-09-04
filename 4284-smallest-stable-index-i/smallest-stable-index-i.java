class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] rightMin = new int[n];
        int min = nums[n-1];
        int leftMax = nums[0];

        for(int i = n-1; i >= 0; i--){
            if(nums[i] <= min){
                min = nums[i];
            }
            rightMin[i] = min;
        }

        int index = -1;
        int leastStable = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] >= leftMax) {
                leftMax = nums[i];
            }

            if(leftMax - rightMin[i] <= k){
                leastStable = leftMax - rightMin[i];
                index = i;
                break;
            }
        }
        return index;
    }
}