## 509 Fibonacci Number
Easy  <br />
brute force approach
```
var fib = function(n) {
    
    if (n == 0) {
        return (0);
    }
    
    else if (n == 1 || n == 2) {
            return (1)
        } else if (n >= 3) {
            return (fib(n-1) + fib(n-2))
        }
    
};

/*
  T.C: O(2^N)
  S.C: O(max_height)
*/
```

memoization
```
var fib = function(n, cache=null) {
    
    if (n==0) {return 0}
    
    if (n ==1 || n==2) {return 1}
    
    if (cache == null) {cache = {};}
    
    if (cache[n]) {return cache[n]}
    
    let result = fib(n-1, cache) + fib(n-2, cache);
    cache[n] = result;
    
    return result;
};

/*
  T.C: O(N)
  S.C: O(N)
*/

```

dynamic programming
```
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
```

# Climbing Stairs
Easy
Brute force approach: perform a depth first search on a decision tree
```
var climbStairs = function(n) {
    
    let count = 0;
    
    let step = (x) => {
        
        // base case:
        if (x==0) {
            
            count++;
            return;
        }
        
        if (x==1) {
            
            step(x-1);
            return;
        }
        
        step(x-1);
        step(x-2);
    }
    
    step(n);
    
    return count;
};

  /*
    T.C: O(2^N)
    S.C: O(max_height)
  */
```

dynamic programming:
```
var climbStairs = function(n) {
    
    let memo = [];
    
    memo[1] = 1, memo[2] = 2;
    
    for (let i = 3; i <= n; i++) {
        
        memo[i] = memo[i-1] + memo[i-2];
    }
    
    return memo[n];
    
    /*
      T.C: O(N)
      S.C: O(N)
    */
};
```

