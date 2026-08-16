class Solution {
    public void nextPermutation(int[] nums) {
        int rightMin = Integer.MIN_VALUE;
        int index = 0; 

        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i-1] < nums[i]){

                int minIndex = nums.length - 1;
                while(nums[minIndex] <= nums[i-1]){
                        minIndex--;
                }

                int temp = nums[i-1];
                nums[i-1] = nums[minIndex];
                nums[minIndex] = temp;
                index = i;
                break;
            }
        }
        
        int j = nums.length - 1;
        while(index < j){
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
            index++;
            j--;
        }
    }
}