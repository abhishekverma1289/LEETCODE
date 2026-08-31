class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int search = target - nums[i];

            if(map.containsKey(search)) return new int[]{map.get(search) , i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}