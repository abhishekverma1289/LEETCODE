class Solution {
public:
    bool isPowerOfFour(int n) {
    if(n==1 || n==0) return n;
        
        return (((n%4)==0) && isPowerOfFour(n/4));
        }
};