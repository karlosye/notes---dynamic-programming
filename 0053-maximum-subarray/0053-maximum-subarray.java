// linear time sln: loop through the array; keep track of 2 variables: maxSub, currSum
// greedy: when currSum < 0, reset to 0 and continue

// subArray: must be continuous

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSub = nums[0];
        int currSum = 0;
        
        // loop through nums:
        for (int number:nums) {
            
            // if currSum < 0, then reset to 0
            if (currSum < 0) {
                
                currSum = 0;
            }
            
            currSum = currSum + number;
            maxSub = Math.max(maxSub, currSum);
        }
        
        return maxSub;
    }
}