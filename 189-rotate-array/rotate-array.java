class Solution {
    public static void reverse(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[end];
            nums[end]= nums[start];
            nums[start] = temp;

            start++; end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        int start = 0;
        int mid = nums.length - 1 - k;
        int end = nums.length - 1;

        reverse(nums , start , mid);
        reverse(nums , mid + 1, end);
        reverse(nums , start, end);
    }
}