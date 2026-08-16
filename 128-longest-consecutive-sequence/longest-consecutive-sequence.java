class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet <Integer>  set = new HashSet<>();
      int maxCount = 0;

      for(int num: nums){
            set.add(num);
      }

      for(int number: set){
            int count = 0;

            if(!set.contains(number - 1)){
                while(set.contains(number)){
                    count++;
                    number++;
                }
            }

            if(count > maxCount) maxCount = count;
      }
      return maxCount;
    }
}