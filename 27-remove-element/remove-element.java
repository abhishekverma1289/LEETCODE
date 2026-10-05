class Solution {
    public int removeElement(int[] nums, int val) {
        int realPos = 0;
        int currentPos = 0;

        while(currentPos < nums.length){
            if(nums[currentPos] != val){
                nums[realPos] = nums[currentPos];
                realPos++;
            }
            currentPos++;
        }
        return realPos;
    }
}