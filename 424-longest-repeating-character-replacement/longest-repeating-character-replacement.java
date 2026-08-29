class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0;
        int maxCount = 0; int maxLength = 0;

        for(int high = 0; high<s.length(); high++){
            map.put(s.charAt(high) , map.getOrDefault(s.charAt(high) , 0) + 1);
            if(map.get(s.charAt(high)) > maxCount){
                maxCount = map.get(s.charAt(high));
            }

            int possibleChanges = high - low + 1 - maxCount;

            while(possibleChanges > k){
                map.put(s.charAt(low) , map.get(s.charAt(low)) - 1);
                low++;
                possibleChanges = high - low + 1 - maxCount;
            }
            maxLength = Math.max(maxLength , high - low + 1);
        }
        return maxLength;
    }
}