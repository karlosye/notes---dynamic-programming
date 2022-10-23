/**
 * @param {number[]} nums
 * @return {number}
 */
    
// use greedy approach this time - end point is guaranteed to be reached

var jump = function(nums) {
    
    let jumps = 0;
    
    let left = 0;
    let right = 0;
    
    while(right < nums.length-1) {
          
        let farthestJump = 0;
        
        for (let i=left; i<right+1; i++) {
            
            farthestJump = Math.max(farthestJump, i+nums[i]);
        }        
        
        left = right + 1;
        right = farthestJump;
        jumps++;
    }
    
    return jumps;
};