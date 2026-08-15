class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] numsCopy = new int[nums.length];
        int i=0;
        int x = 0 ; int y = 0;

        while(y < nums.length){
            if(nums[y] >= 0){
                numsCopy[i] = nums[y];
                i += 2;
            }
            y++;
        } 

        i=1;
        while(x < nums.length){
            if(nums[x] < 0){
                numsCopy[i] = nums[x];
                i += 2;
            } 
            x++;
        }

        i=0;
        for(int num: numsCopy){
            nums[i] = num;
            i++;
        }
        return nums;
    }    
 }
