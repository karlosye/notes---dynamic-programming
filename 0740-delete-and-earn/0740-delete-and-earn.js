/**
 * @param {number[]} nums
 * @return {number}
 */

// hint: hashmap + sorting the array and remove duplicate

var deleteAndEarn = function(nums) {

    let hm = {};
    
    for (let number of nums) {
        
        hm[number] = (hm[number]||0) + 1;
    }
    
    nums = nums.filter( (item,index) => nums.indexOf(item) === index );
    nums = nums.sort(function(a,b) {return a-b});
    
    if (nums.length ==1) {return nums[0] * hm[nums[0]]}
    
    let dp = [];
    dp[0] = nums[0] * hm[nums[0]];
    dp[1] = nums[1]==nums[0]+1? Math.max(nums[1]*hm[nums[1]],dp[0]) : dp[0]+nums[1]*hm[nums[1]];
    
    for(let i=2; i<nums.length;i++) {
        
        if (nums[i] == nums[i-1] + 1) {
            
            dp[i] = Math.max(nums[i]*hm[nums[i]] + dp[i-2] , dp[i-1]);
            
        } else {
            
            dp[i] = dp[i-1] + nums[i]*hm[nums[i]];
        }
    }
    
    return dp[dp.length-1];
};