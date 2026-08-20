class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start < end){
            int mid = start + (end - start)/2;

            
            if(nums[mid - 1] < nums[mid]){
                ans = mid;
                start = mid + 1;
            }
            else end = mid;
        }
        return ans;
    }
}