
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int prevMax = values[0] + 0;
        int res = values[0] + 0 + values[1] - 1;
        
        // loop through j:
        for (int j = 1; j<values.length; j++) {
            
            // update the res:
            res = Math.max(res, values[j] - j + prevMax);
            
            // update the prevMax:
            prevMax = Math.max(prevMax, values[j] + j);
        }
        
        return res;        
    }
}