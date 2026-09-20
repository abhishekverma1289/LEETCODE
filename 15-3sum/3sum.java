class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
         List<List<Integer>> list = new ArrayList<>();

         for(int start = 0; start<nums.length - 2; start++){
            //skip the start duplicates
            if (start > 0 && nums[start] == nums[start - 1]) {
                continue;
            }

            int end = nums.length - 1;
            int mid = start + 1;

            while(mid < end){
                int sum = nums[start] + nums[mid] + nums[end];
                if(sum > 0) end--;
                else if(sum < 0) mid++;
                else{
                    list.add(Arrays.asList(nums[start] , nums[mid] , nums[end]));

                 // Skip duplicate mid values
                    while (mid < end && nums[mid] == nums[mid + 1]) {
                        mid++;
                    }

                    // Skip duplicate end values
                    while (mid < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    
                    mid++; end--;
                }
            }
         }
         return list;
    }
}