// given an 2d array, determine if the person can attend all the meetings

// approach: sort the array by starting time; loop through the array and compare the previous ending time and next starting time

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        // sort the intervals array based on the starting time point: 
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        // loop through the array and compare the prevEnd and nextStart
        for (int i=0; i<intervals.length-1; i++) {
            
            int prevStart = intervals[i][1];
            int nextEnd = intervals[i+1][0];
            
            if (nextEnd < prevStart) {
                
                return false;
            }
        }
        
        return true;
    }
}