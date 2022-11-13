class Solution {
public:

        string reverseWords(string s) {
        string res;
        int i = 0, n = s.length();
        
        while(i < n){
            while(i < n && s[i] == ' ') i++;
            
            if(i >= n) break;
            
            int j = i;
            while(j < n && s[j] != ' ') j++;
            string sub = s.substr(i, j-i);
            
            if(res.length() == 0) res = sub;
            
            else res = sub + " " + res;
            
            i = j+1;
        }
        
        return res;
        
    }
};