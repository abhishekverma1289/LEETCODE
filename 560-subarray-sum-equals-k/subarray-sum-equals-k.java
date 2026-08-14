class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);

        for(int num: nums){
            sum += num;
            int target = sum - k;

            count += map.getOrDefault(target , 0);
            map.put(sum , map.getOrDefault(sum , 0) + 1);
        }
        return count;
    }
}