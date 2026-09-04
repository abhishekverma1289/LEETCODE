class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       ArrayList<Integer> list = new ArrayList<>();

       //is p is bigger how can s contain it , in any order possible
       if(p.length() > s.length()) return list;

       int[] required = new int[26];
       int[] window = new int[26];

       //create a required frequency Array
       for(char c : p.toCharArray()){
        required[c - 'a']++;
       }

       // creating a Window Frequency Array
       for(int i = 0; i<p.length(); i++){
        char ch = s.charAt(i);
        window[ch - 'a']++;
       } 

       //at index 0 , if first window is valid answer
       if(Arrays.equals(window, required)) list.add(0);

       for(int high = p.length(); high<s.length(); high++){
        char lowCh = s.charAt(high - p.length());
        char highCh = s.charAt(high);
        window[lowCh - 'a']--;
        window[highCh - 'a']++;

        if(Arrays.equals(window, required)) list.add(high - p.length() + 1);
       }
       return list;
    }
}