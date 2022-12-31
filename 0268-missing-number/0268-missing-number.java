// the nums array contains distinct integers; find the missing integer from 0 to nums.length;

// use XOR: init a missing variable; loop from 0 to nums.length; update the missing vairable using XOR

class Solution {
    public int missingNumber(int[] nums) {
        
        int missing = nums.length;
        
        // for loop from 0 to nums.length
        for (int i=0; i<nums.length; i++) {
            
            missing = missing ^ i ^ nums[i];
        }
        
        return missing;
    }
}