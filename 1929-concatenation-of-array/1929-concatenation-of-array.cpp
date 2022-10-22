class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> ans(2*nums.size());
        int z=0;
        for(int i=0;i<2*nums.size();i++)
        {
            if(i<nums.size())
            ans[i]=nums[i];
            if(i>=nums.size())
            {
             ans[i]=nums[z];
             z++;
            }
       
        }
        return ans;    
        
    }
};