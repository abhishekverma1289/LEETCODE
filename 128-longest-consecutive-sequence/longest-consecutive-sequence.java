class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int maxCount = 0;
        for(int num : set){
            int count = 0;
            int nextNum = num;

            if(set.contains(nextNum - 1)){
                continue;    
            } 
            else{
                while(set.contains(nextNum)) {
                    count++;
                    nextNum++;
                }
            }

            if(maxCount < count){
                    maxCount = count;
            }
        }
    return maxCount;
}
}