class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap <Character , Integer> map = new HashMap <>();
       HashMap <Character , Integer> map2 = new HashMap <>();

       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        int freq = map.getOrDefault(ch,0)+1;
        map.put(ch,freq);
       }

       for(int i=0; i<t.length(); i++){
        char ch = t.charAt(i);
        int freq = map2.getOrDefault(ch,0)+1;
        map2.put(ch,freq);
       }

       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        int freq = map.get(ch);
        if(map2.getOrDefault(ch,0) != freq) return false;
       }
       
       for(int i=0; i<t.length(); i++){
        char ch = t.charAt(i);
        int freq = map2.get(ch);
        if(map.getOrDefault(ch,0) != freq) return false;
       }

       return true;
    }
}