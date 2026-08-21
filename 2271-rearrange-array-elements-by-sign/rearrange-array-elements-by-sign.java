class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] numsCopy = new int[nums.length];
        int i = 0; int j = 1;

        for(int num: nums){
            if(num >= 0){
                numsCopy[i] = num;
                i += 2;
            }
            else {
                numsCopy[j] = num;
                j += 2;
            }
        }
        return numsCopy;
    }
}