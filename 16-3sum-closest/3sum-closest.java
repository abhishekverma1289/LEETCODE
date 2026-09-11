class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = -1;
        int diff = Integer.MAX_VALUE;

        for(int start = 0; start < nums.length - 2; start++){
            int mid = start + 1;
            int end = nums.length - 1;

            while(mid < end){
                int sum = nums[start] + nums[mid] + nums[end];

                if(Math.abs(target - sum) < diff){
                    closest = sum;
                    diff = Math.abs(target - sum);
                }

                if(sum > target) end--;
                else if(sum < target) mid++;
                else return sum;
            }

        }
        return closest;
    }
}