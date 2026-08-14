class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num , num);
        }

        int maxCount = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int count = 0;
            int nextNum = entry.getKey();

            if(map.containsKey(nextNum - 1)) continue;
            
            while(map.containsKey(nextNum)) {
                count++;
                nextNum++;
            }
            if(maxCount < count){
                maxCount = count;
            }
        }
        return maxCount;
    }
}