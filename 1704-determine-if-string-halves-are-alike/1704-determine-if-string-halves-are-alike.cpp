class Solution {
public:
    bool halvesAreAlike(string s) {
       int t=0;
        for(int i=0;i<s.size();i++)
        {   
            s[i]=tolower(s[i]);
            if(i<s.size()/2)
            {
                if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
                      t++;
            }
            else
            {
                if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
                     t--; 
            }     
        } 
       return (t==0);
    }
};