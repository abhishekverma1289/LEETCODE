class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while(start < end){
            int area = Math.min(height[start] , height[end]) * (end - start);
            maxArea =  Math.max(area , maxArea);

            if(height[start] < height[end]) start++;
            else if(height[end] < height[start]) end--;
            else{
                start++;
            }
        }
        return maxArea;
    }
}