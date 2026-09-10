class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] window = new int[26];
        int[] required = new int[26];

        if(s1.length() > s2.length()) return false;
        
        //required  
        for(char ch: s1.toCharArray()){
            required[ch - 'a']++;
        }

        //current window
        for(int i=0; i<s1.length(); i++){
            char ch = s2.charAt(i);
            window[ch - 'a']++;
        }

        if(Arrays.equals(required , window)) return true;

        //move the window
        int low = 0;
        for(int high = s1.length(); high<s2.length(); high++){
            char highChar = s2.charAt(high);
            window[highChar - 'a']++;

            char lowChar = s2.charAt(low);
            window[lowChar - 'a']--;
            low++;

            if(Arrays.equals(required , window)) return true;
        }
        return false;
    }
}