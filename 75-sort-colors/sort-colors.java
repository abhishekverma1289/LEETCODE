class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid <= end){

            switch(nums[mid]){
                case 0:
                int temp1 = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp1;
                start++;
                mid++;
                break;

                case 1: 
                mid++; 
                break;

                case 2: 
                int temp2 = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp2;
                end--;

            }
        } 
    }
}