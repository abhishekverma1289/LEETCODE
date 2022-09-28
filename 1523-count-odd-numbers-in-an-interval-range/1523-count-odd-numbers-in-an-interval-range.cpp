class Solution {
public:
    int countOdds(int low, int high) {
        int count=0;
        for(int a=low;a<=high;a++)
        {
            if((a%2)!=0)
            {
               count++ ;
            }
        }
        return count;
        return 0;}
};