class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }

            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }

        int bothEnds = (Math.min(maxIndex , minIndex) + 1) + (nums.length - Math.max(maxIndex , minIndex));

        int fromEnd = nums.length - Math.min(maxIndex , minIndex);

        int fromStart = Math.max(maxIndex , minIndex) + 1;

        if(bothEnds < fromEnd && bothEnds < fromStart ) return bothEnds;
        else if (fromEnd < bothEnds && fromEnd < fromStart) return fromEnd;
        else  return fromStart;
}
}