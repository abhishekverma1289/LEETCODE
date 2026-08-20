class Solution {
    public int maxProduct(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1; i<nums.length; i++){
            if(nums[i] >= largest){
                secondLargest = largest;
                largest = nums[i];
            }

            if(nums[i] > secondLargest && nums[i] < largest){
                secondLargest = nums[i];
            }
        }
        return (largest - 1) * (secondLargest - 1);
    }
}