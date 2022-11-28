class Solution {
public:
    int maxProfit(vector<int>& nums) {
        int low=INT_MAX,pro=0,maxprofit=INT_MIN;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]<low) low=nums[i];
            pro=nums[i]-low;
            maxprofit=max(pro,maxprofit);
        }
      return maxprofit;  
    }
};