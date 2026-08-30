class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int low = 0;
        int maxLength = -1;
        
        for(int high = 0; high < nums.length; high++){
            int highValue = map.getOrDefault(nums[high] , 0) + 1;
            map.put(nums[high] , highValue);

            while(high - low + 1 - map.getOrDefault(1 , 0) > k){
                int lowValue = map.getOrDefault(nums[low] , 0) - 1;
                map.put(nums[low] , lowValue);
                low++;
            }
            maxLength = Math.max(maxLength , high - low + 1);
        }
        return maxLength;  
    }
}