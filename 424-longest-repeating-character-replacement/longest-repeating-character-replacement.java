class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int maxCharFreq = 0;  int longestSub = 0;  int low = 0;

        for(int high=0; high<s.length(); high++){
            int value = map.getOrDefault(s.charAt(high) , 0) + 1;
            map.put(s.charAt(high) , value);

            maxCharFreq = Math.max(maxCharFreq , value);

            while(high - low - maxCharFreq + 1 > k){
                map.put(s.charAt(low) , map.get(s.charAt(low)) - 1);
                if(map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            longestSub = Math.max(longestSub , high - low + 1);
        }
        return longestSub;
    }
}