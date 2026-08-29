class Solution {
    public int trap(int[] heights) {
        int[] prefixMax = new int[heights.length];
        int max = 0;

        for(int i=0; i<heights.length; i++){
            prefixMax[i] = max;
            if(max < heights[i])
            max = heights[i];
        }

        int[] suffixMax = new int[heights.length];
        max = 0;

        for(int i = heights.length - 1; i>=0; i--){
            suffixMax[i] = max;
            if(max < heights[i])
            max = heights[i];
        }

        int totalwater = 0;

        for(int i=0; i<heights.length; i++){
            if(prefixMax[i] > heights[i] && suffixMax[i] > heights[i]){
                totalwater += Math.min(prefixMax[i] , suffixMax[i]) - heights[i];
            }
        }
        return totalwater;
        } 
}