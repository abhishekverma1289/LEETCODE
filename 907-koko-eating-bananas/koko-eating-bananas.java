class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int start = 1;
     int end = Arrays.stream(piles).max().orElseThrow();

     while(start < end){
        int mid = start + (end - start)/2;
        int count = 0;

        for(int banana :piles){
            count += (banana + mid - 1) / mid;
        }

        if(count > h){
            start = mid + 1;
        }
        else{
            end = mid;
        }
    }
    return start;
 }
}