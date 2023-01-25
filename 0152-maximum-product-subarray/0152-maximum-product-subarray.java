// find the max. product subArray; subArray has to be continuous

// approach: loop through nums once; for each loop, find max(n, currMin, currMax), return res in the end

class Solution {
    public int maxProduct(int[] nums) {
     
        // init res to the max. number of nums:
        int res = Integer.MIN_VALUE;
        for (int number:nums) {
            res = Math.max(res, number);
        }
        
        // init 2 global variabes: currMin currMax
        int currMin = 1;
        int currMax = 1;
        
        // loop through nums
        for (int i=0; i<nums.length; i++) {
            
            // edge case:0 - reset currMin & currMax
            if (nums[i] == 0) {
                currMin = 1;
                currMax = 1;
                continue;
            }
            
            // compute:
            int temp = currMin;
            currMin = Math.min(currMin * nums[i], Math.min(currMax * nums[i], nums[i]));
            currMax = Math.max(temp * nums[i], Math.max(currMax * nums[i], nums[i]));
            
            // update res:
            // res = Math.max(res, currMin, currMax);
            res = Collections.max(Arrays.asList(res, currMin, currMax));
        }
        
        return res;
    }
}