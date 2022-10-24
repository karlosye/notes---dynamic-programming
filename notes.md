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

## 55. Jump Game
Dynamic programming with memoization: S.C-O(N) T.C-O(N^2)  
```
var canJump = function(nums) {
    
    let memo = [];
    
    let backtrack = (num) => {
        
        // if memo index has false:
        if (memo[num] == true || memo[num] == false) {return memo[num]}
        
        // jump outside of the array
        if (num >= nums.length) {return false}
        
        // if reaching the last index of the array:
        if (num == nums.length - 1) {return true}
        
        // make a for loop:
        for (let i=1; i<=nums[num]; i++) {
            
            if (num + i < nums.length && backtrack(num + i)) {return true}
        }

        // save 'false' into the memo array
        memo[num] = false;
        
        return false;
    }
    
    return backtrack(0);
};
```

Greedy approach: S.C-O(1) T.C-O(N)
```
var canJump = function(nums) {
    
    let goal = nums.length - 1;
    
    for (let i=goal-1; i>=0; i--) {
        
        if (i + nums[i] >= goal) {
            
            goal = i;
        }
    }

    return goal == 0;
};
```

## 53. Maximum subarray
use a nested for loop approach - Quadratic runtime 
```
// use a nested for loop approach - Quadratic runtime 

var maxSubArray = function(nums) {
    
    let maxSum = nums[0];

    for (let i=0; i<nums.length; i++) {
        
        let currSum = 0;
        
        for (let j=i; j<nums.length; j++) {
            
            currSum = currSum + nums[j];
            
            maxSum = Math.max(maxSum, currSum);
        }
    }
    
    return maxSum;
};
```
Dynamic programming - sliding window approach
Linear runtime and constant space
```
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
```
