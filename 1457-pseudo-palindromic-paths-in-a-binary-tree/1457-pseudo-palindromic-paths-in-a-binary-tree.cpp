class Solution {
public:int ans = 0;
    //storing the number of palindrome
     unordered_map<int, int> um;
    // for storing the occurence of each integer
    void helper(TreeNode* root){
        if(root==NULL) return ;
        //when we will call the left or right child of leaf node or our node will be empty
        um[root->val]++;
        // we will increase the occurece of digit by one 
        
             if(root->left==NULL && root->right==NULL)
             {
                    int temp=0;
              for(int i=0; i<=9; i++)
                {
                   if(um[i]%2!=0) 
                   temp++;
                }
              if(temp<=1) ans++;
            
              }
         helper(root->left);
        // calling left child of node
    helper(root->right);
        // caling right child of node
    um[root->val]--;
        // removing the occurence of node, when we are going one step back
        
    }
    int pseudoPalindromicPaths (TreeNode* root) {
       
        helper(root);
        return ans;
    }
};

