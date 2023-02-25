// produce a new int[][] with newInterval inserted; the intervals is already sorted by start_i; the given interval is non-overlapping; the return interval does not have to be sorted;

// method: loop throught the entire intervals; compare the start and end points, then merge;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        // init an res list: list of 2d array
        List<int[]> res = new ArrayList<>();
        
        // loop through the array; and check endpoints conditions
        for (int i=0; i<intervals.length; i++) {
            
            int[] currInterval = intervals[i];
            
            // if the interval starts before currInterval
            if (newInterval[1] < currInterval[0]) {
                
                res.add(newInterval);
                newInterval = currInterval;
            } 
            // if newInterval happens after the currInterval
            else if (newInterval[0] > currInterval[1]) {
                
                res.add(currInterval);
                
            } else {
              
                // take the min. of 2 start point, and max. of 2 end point:
                newInterval[0] = Math.min(newInterval[0], currInterval[0]);
                newInterval[1] = Math.max(newInterval[1], currInterval[1]);
            }
        }
        
        res.add(newInterval);
        
        return res.toArray(new int[res.size()][]);
    }
}