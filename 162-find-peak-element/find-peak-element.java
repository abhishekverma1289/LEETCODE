class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] < nums[mid+1]) start = mid + 1;        // will never go out of bounds bcs start < end , so mid is always < end;
            else end = mid;   //when search shrink in left start = 0 end = 1 , we either move end = mid , so loop stops that why we dont do mid - 1; beautiful part nigger
        }
        return start;
    }
}