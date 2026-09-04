class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int[] rightMin = new int[n];
        int min = nums[n-1];

        for(int i = n-1; i >= 0; i--){
            if(nums[i] <= min){
                min = nums[i];
            }
            rightMin[i] = min;
        }

        int leftMax = nums[0];

        for(int i=0; i<n; i++){
            if(nums[i] >= leftMax) {
                leftMax = nums[i];
            }

            if(leftMax - rightMin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}