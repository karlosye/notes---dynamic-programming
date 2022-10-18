/**
 * @param {number} n
 * @return {number}
 */


var memo = [0,1];

var fib = function(n) {
    
    // memoization approach:
    
    if (n==0) {return 0}
    
    if (n==1) {return 1}
    
    for (let i=2; i<=n; i++) {
        
        memo[i] = memo[i-1] + memo[i-2]
    }

    
    return memo[n];
};

/*
    T.C: O(N)
    S.C: O(N)
*/