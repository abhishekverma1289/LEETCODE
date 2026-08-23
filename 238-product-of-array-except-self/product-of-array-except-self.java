class Solution {
    public int[] productExceptSelf(int[] nums) {
     int index = -1;
     int product = 1;
     int count = 0;

     for(int i =0; i<nums.length; i++){
        if(nums[i]==0){
            index = i;
            count++;
        }
        else product *= nums[i];
     }

     int[] ans = new int[nums.length];
     int i=0;

     if(count==0)  {
        for(int num:nums){
            ans[i] = product/num;
            i++;
        }
        return ans;
     }
     else if(count == 1){
        ans[index] = product;
        return ans;
     }
     else return ans;
    }
}