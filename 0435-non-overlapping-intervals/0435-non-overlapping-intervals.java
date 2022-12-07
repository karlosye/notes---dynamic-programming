// return the min.number of interval to be removed, so that no overlap

// sort the array by the starting point; then loop through the array and compare adjacent start and end

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int res = 0;
        
        // sort the intervals array by the starting point
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));        
        
        // keep track of an end variable:
        int prevEnd = intervals[0][1];
        
        // loop through the intervals:
        for (int i=1; i<intervals.length; i++) {
            
            // if no overlap:
            if (intervals[i][0] >= prevEnd) {
                
                prevEnd = intervals[i][1];
                
            } else {
                
                // if overlap exist: remove one and update the prevEnd variable
                res = res + 1;
                prevEnd = Math.min(prevEnd, intervals[i][1]);
            }
        }
        
        return res;
    }
}