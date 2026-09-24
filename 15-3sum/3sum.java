class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int start = 0; start < nums.length - 2; start++){
            while(start > 0 && start < nums.length && nums[start] == nums[start - 1]) start++;

            int mid = start + 1;
            int end = nums.length - 1;

            while(mid < end){
                int sum = nums[start] + nums[mid] + nums[end];

                if(sum == 0){
                    List<Integer> ansList = new ArrayList<>();
                    ansList.add(nums[start]);
                    ansList.add(nums[mid]);
                    ansList.add(nums[end]);

                    list.add(ansList);

                    while(mid < end && nums[mid] == nums[mid + 1]) mid++;
                    while(mid < end && nums[end] == nums[end - 1]) end--;

                    mid++; end--;
                }
                else if(sum > 0) end--;
                else mid++;
            }
        }
            return list;
    }
}