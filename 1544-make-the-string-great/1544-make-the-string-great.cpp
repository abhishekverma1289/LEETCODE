class Solution {
public:
    string makeGood(string stri) {
     
      
        for(int i=0; i<stri.length()-1; i++){       
            if((stri[i]==stri[i+1]+32) || (stri[i]==stri[i+1]-32))
            {  
                stri.erase(i,2);
                i=max(-1,i-2);              
            }
            if(stri.length()==0)
                break;    
        }
       return stri; 
    }
};