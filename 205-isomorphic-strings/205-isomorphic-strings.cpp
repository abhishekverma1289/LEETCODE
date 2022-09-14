class Solution {
public:
bool isIsomorphic(string s, string t) {
    map<char,char> s_t, t_s;
    for(int i=0;i<s.size();i++) {
        
        
            if(s_t.find(s[i])!=s_t.end() and t[i]!=s_t[s[i]] or
              t_s.find(t[i])!=t_s.end() and s[i]!=t_s[t[i]])
            {
                return false;
            }
        else {
            s_t[s[i]]= t[i];
            t_s[t[i]]=s[i];
        }
        
    }
    
    
    return true;
}
};