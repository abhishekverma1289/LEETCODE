class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;

        while( j < nums.length){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        i=nums.length-1; j=nums.length-1;
         while(i >= 0){
            if(nums[i] == 2){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            i--;
        } 
        
    }
}