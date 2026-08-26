class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int countOfZero = 0;
        int indexOfZero = -1;
        int product = 1;

        for(int i=0; i<n; i++){
            if(nums[i] == 0) {
                indexOfZero = i;
                countOfZero++;
            }
            else product *= nums[i];
        } 

        int[] ans = new int[n];

        if(countOfZero > 1) return ans;
        else if(countOfZero == 1) {
            ans[indexOfZero] = product;
            return ans;
        }
        else{
            for(int i=0; i<n; i++){
                ans[i] = product/nums[i];
            }
            return ans;
        }
    }
}