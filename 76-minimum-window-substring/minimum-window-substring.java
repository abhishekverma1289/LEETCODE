class Solution {

    public String minWindow(String s, String t) {
        HashMap <Character , Integer> map2 = new HashMap<>();
        HashMap <Character , Integer> map = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int low = 0;
        int start = -1;
        int formed = 0;


        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            int value = map2.getOrDefault(ch,0)+1;
            map2.put(ch,value);
        }

        for(int high=0; high<s.length(); high++){
            char ch = s.charAt(high);
            int value = map.getOrDefault(ch,0)+1;
            map.put(ch,value);

            if(map2.containsKey(ch) && (int) map.get(ch) == (int) map2.get(ch)) {{
                formed++;
            }

            while(formed == map2.size()){
                if(minLength > high-low+1){
                    start = low;
                    minLength = high - low + 1;
                }

            char lowCh = s.charAt(low);
            int lowvalue = map.get(lowCh) - 1;
            map.put(lowCh , lowvalue);
            low++;
                if(map2.containsKey(lowCh) && map.get(lowCh) < map2.get(lowCh)){
                    formed--;
                }
            }
        }
      }
        if (start == -1) return "";
        return s.substring(start, start+minLength);
    }
}