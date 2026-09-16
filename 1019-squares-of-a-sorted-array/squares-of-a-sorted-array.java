class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int start = 0; int end = n - 1; int resultpos = n - 1;

        while(start <= end){
            if ( nums[start] * nums[start] > nums[end] * nums[end]){
                result[resultpos] = nums[start] * nums[start];
                start++; resultpos--;
            }
            else {
                result[resultpos] = nums[end] * nums[end];
                end--; resultpos--;
            }
        } 
        return result;
    }
}