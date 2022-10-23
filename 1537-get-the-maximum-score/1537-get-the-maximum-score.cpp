const int mod = 1e9 + 7;

 class Solution {
 public:
	 int maxSum(vector<int>& nums1, vector<int>& nums2) {

     set<int> s;
     for(int i : nums2){
	        s.insert(i);
	   }
    
     long long int a = 0 , b = 0 , j = 0 , m = nums1.size() , num = nums2.size() , cnt = 0;
     for(int i=0;i<m;i++){
         a += nums1[i]%mod;
         if(s.count(nums1[i])){
             while(j < num && nums2[j] != nums1[i]){
                  b += nums2[j++]%mod;
             }
             b += nums2[j++]%mod;
             cnt += max(a , b);
             a = 0 , b = 0;
         }
     }
     
     while(j < num){
          b += nums2[j++] % mod;    
     }
     cnt += max(a , b) % mod;
     return cnt%mod;   
 }
 };
