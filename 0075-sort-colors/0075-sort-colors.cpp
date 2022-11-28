class Solution {
public:
    void sortColors(vector<int>& nums) {
        int count0,count1,count2;
        count0=count1=count2=0;
for(int i=0;i<nums.size();i++){
    if(nums[i]==0) 
    {
        count0++;
    }
    else
    if(nums[i]==1) count1++;
    else count2++;
}
    nums.clear();
        while(count0!=0) {
            nums.push_back(0);
            count0--;
        }
                while(count1!=0) {
            nums.push_back(1);
            count1--;
        }
                while(count2!=0) {
            nums.push_back(2);
            count2--;
        }
    }
};