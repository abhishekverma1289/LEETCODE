class Solution {
    public void sortColors(int[] nums) {
       int red = 0;
       int white = 0;
       int blue = nums.length - 1;

       while(white <= blue){
            switch(nums[white]){
                case 0:
                {
                    int temp = nums[red];
                    nums[red] = nums[white];
                    nums[white] = temp;
                    red++; white++;
                    break;
                }
                case 1:
                {
                    white++;
                    break;
                }
                case 2: 
                {
                    int temp2 = nums[blue];
                    nums[blue] = nums[white];
                    nums[white] = temp2;
                    blue--;
                    break;
                }
            }
       }  
    }
}