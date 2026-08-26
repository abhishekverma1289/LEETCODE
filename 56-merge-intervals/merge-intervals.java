class Solution {
    public int[][] merge(int[][] intervals) {
            ArrayList<int[]> result = new ArrayList<int[]>();
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);


            int firstInterval = intervals[0][0];
            int secondInterval = intervals[0][1];

            for(int i=1; i<intervals.length; i++){
               if(secondInterval >= intervals[i][0]){
                secondInterval = Math.max(secondInterval , intervals[i][1]);
               }
               else{
                result.add(new int[]{firstInterval, secondInterval});
                firstInterval = intervals[i][0];
                secondInterval = intervals[i][1];
               }
            }
            result.add(new int[]{firstInterval , secondInterval});
            return result.toArray(new int[result.size()][]);
    }
}