/**
 * @param {number[]} cost
 * @return {number}
 */

// dynamic programming approach

var minCostClimbingStairs = function(cost) {

    let dp = new Array(cost.length+1);
    dp[dp.length - 1] = 0;
    dp[dp.length - 2] = cost[cost.length-1];
    
    // input cost is an array
    for (let i=dp.length-3; i>=0; i--) {
        
        dp[i] = Math.min(cost[i] + dp[i+1], cost[i] + dp[i+2])
    }    
    
    return Math.min(dp[0],dp[1]);
};