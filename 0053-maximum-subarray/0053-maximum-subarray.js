/**
 * @param {number[]} nums
 * @return {number}
 */

var maxSubArray = function(nums) {

    // initialize maxSum and currSum:
    let maxSum = nums[0];
    let currSum = 0;
    
    for (let num of nums) {
        
        if (currSum < 0) {currSum = 0}
        
        currSum = currSum + num;
        maxSum = Math.max(maxSum, currSum);
    }
    
    return maxSum;
};