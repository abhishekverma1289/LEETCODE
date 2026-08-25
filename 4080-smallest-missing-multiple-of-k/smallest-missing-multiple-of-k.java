class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
        }
        int i = 1; int multiple = k;
        while(set.contains(multiple)){
            i++;
            multiple = k*i;     
        }
        return multiple;
    }
}