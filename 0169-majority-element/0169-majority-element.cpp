class Solution {
public:
    int majorityElement(vector<int>& nums) {
    int n=nums.size();
    int count=1;
    sort(nums.begin(),nums.end());
    if(nums.size()==1 || nums.size()==2) return nums[0];
    for(int i=0;i<n;i++ )
    {
      if(nums[i]==nums[i+1]) count++;
      else if(count>(n/2))
      {
          return nums[i-1];
      }
     if(nums[i]!=nums[i+1]) count=1;
    }return nums[0];
        }
};