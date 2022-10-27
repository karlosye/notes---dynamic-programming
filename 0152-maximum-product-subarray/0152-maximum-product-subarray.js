/**
 * @param {number[]} nums
 * @return {number}
 */


var maxProduct = function(nums) {

    // initialize the res variable
    let res = Math.max(...nums);
    
    let currMin = 1;
    let currMax = 1;
    
    // loop through the nums array:
    for (let num of nums) {
        
        // edge case:0
        if (num == 0) {
            
            currMin = currMax = 1;
            continue;
        }
        
        let temp = currMax;
        
        currMax = Math.max(currMax*num, currMin*num, num);
        currMin = Math.min(temp*num, currMin*num, num);
        res = Math.max(res, currMax);
    }
    
    return res;
};