class Solution {
    public int[][] merge(int[][] intervals) {
        //creating an arraylist to add all the answer
        ArrayList<int[]> result = new ArrayList<int[]>();

        //sorting all the arrays in order
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //defining the Start and End interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            //define the nextStart and ends to compare
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            //if overlap make it start -- end according to which last bound is bigger
            if(end >= nextStart){
                end = Math.max(end , nextEnd);
            }
            else{                 //else just add them & define new start and end 
                result.add(new int[]{start , end});
                start = nextStart;
                end = nextEnd;
            }
        }

        //add one remaining
        result.add(new int[]{start , end});

        return result.toArray(new int[result.size()][]);
    }
}
