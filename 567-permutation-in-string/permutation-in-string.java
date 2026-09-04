class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap< Character , Integer > map = new HashMap<>();
       HashMap< Character , Integer >  map2 = new HashMap<>();
       int formed = 0;

       //edge case 
       if(s2.length() < s1.length()) return false;

       //required map
       for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            int value = map2.getOrDefault(ch,0);
            map2.put(ch , value + 1);
        }
        

        //current window map
        for(int i=0; i<s1.length(); i++){
            char ch = s2.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);

            if(map2.containsKey(ch) && (int) map.get(ch) == (int) map2.get(ch)){
                formed++;
            }
        }

        if(formed == map2.size()){
            return true;
        }

        int low = 0;
        for(int high = s1.length(); high<s2.length() ; high++){
            char ch = s2.charAt(high);
            char lowch= s2.charAt(low);

            if(map2.containsKey(lowch) && (int) map.get(lowch) == (int) map2.get(lowch)){
                formed--;
            }
            map.put(lowch , map.get(lowch) - 1);

            map.put(ch , map.getOrDefault(ch,0)+1);
            if(map2.containsKey(ch) && (int) map.get(ch) == (int) map2.get(ch)){
                formed++;
            }
            low++;

            if(formed == map2.size()) return true;
        }
        return false;
    }
}