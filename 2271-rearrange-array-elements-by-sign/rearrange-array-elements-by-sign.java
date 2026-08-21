class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] numsCopy = new int[nums.length];
        int positiveIndex = 0; int negativeIndex = 1;

        for(int num: nums){
            if(num >= 0){
                numsCopy[positiveIndex] = num;
                positiveIndex += 2;
            }
            else {
                numsCopy[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return numsCopy;
    }
}