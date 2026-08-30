class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int start = 0;
        int end = ( nums.length * nums[0].length ) - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int row = mid / nums[0].length;
            int columns = mid % nums[0].length;

            if(nums[row][columns] == target) return true;

            if(nums[row][columns] > target) end = mid - 1;
            else if(nums[row][columns] < target) start = mid + 1;
            else return true;
        }
        return false;
    }
}