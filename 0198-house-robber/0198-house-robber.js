/**
 * @param {number[]} nums
 * @return {number}
 */

// use top-down approach this time: recursion with memoization

var rob = function(nums) {
    let memo = [];
    
    let recur = function(i) {
        if (i >= nums.length) return 0;
        if (memo[i]!=null) return memo[i];
        
        memo[i] = Math.max(recur(i+2) + nums[i], recur(i+1))
        return memo[i];
    }
    return recur(0);
};