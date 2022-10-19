/**
 * @param {number[]} nums
 * @return {number}
 */

// input nums is an array; use recursion with memoization - top down

var rob = function(nums) {
    
    if (nums.length ==1) {return nums[0]}
    if (nums.length == 2) {return Math.max(nums[0], nums[1])}
    
    var helper = function(nums) {
        
        let memo = [];

        let recur = function(i) {
            if (i >= nums.length) return 0;
            if (memo[i]!=null) return memo[i];

            memo[i] = Math.max(recur(i+2) + nums[i], recur(i+1))
            return memo[i];
        }
        
        return recur(0);
    }
    
    return Math.max( helper(nums.slice(0,nums.length-1)) , helper(nums.slice(1,nums.length)))
};