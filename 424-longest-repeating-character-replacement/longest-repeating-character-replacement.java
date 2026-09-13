class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0; int maxChValue = 0; int maxLength = 0;

        for(int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            int chValue = map.getOrDefault(ch , 0) + 1;
            map.put(ch,chValue);

            maxChValue = Math.max(maxChValue , chValue);

            while(high - low + 1 - maxChValue > k){
                char lowCh = s.charAt(low);
                int lowChValue = map.get(lowCh);
                map.put(lowCh , lowChValue - 1);
                low++;
            }

            maxLength = Math.max(maxLength , high - low + 1);
        }
        return maxLength;
    }
}