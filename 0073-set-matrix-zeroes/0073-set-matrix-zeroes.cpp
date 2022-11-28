class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
     int rowsize=matrix.size();
     int colsize=matrix[0].size();
     vector<int> row(rowsize,1);
     vector<int> col(colsize,1);
     
     for(int i=0;i<rowsize;i++)
     {
         for(int j=0;j<colsize;j++)
         {
             if(matrix[i][j]==0) 
             {
                 row[i]=0;
                 col[j]=0;
             }
         }
     }
     for(int i=0;i<rowsize;i++)
     {
         for(int j=0;j<colsize;j++)
         {
             if(row[i]==0 or col[j]==0) matrix[i][j]=0;
         }
     }
    }
};




