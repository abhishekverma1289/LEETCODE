class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        HashMap <Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++ ){
            int search = target - nums[i];

            if(map.containsKey(search)) return new int[]{i , map.get(search)};
            map.put(nums[i] , i);
        }
        return new int[]{};
    }
}