class Solution {
    public int removeDuplicates(int[] nums) {
        int originalIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[originalIndex]){
                originalIndex++;
                nums[originalIndex] = nums[i];
            }
        }
        return originalIndex + 1;
    }
}