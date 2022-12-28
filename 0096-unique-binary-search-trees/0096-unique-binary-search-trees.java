// BST: left val < root.val and right val > root.val
// recursive approach: dfs (top-down approach)

// try if you can add a cache

class Solution {
    
    int[] cache = new int[20];
    
    public int numTrees(int n) {
        
        // check if this n exists in cache:
        if (this.cache[n] != 0) {
            
            return this.cache[n];
        }
        
        // base case:
        if (n == 0 || n == 1) {
            
            this.cache[n] = 1;
            
            return 1;
        }
        
        // recursive case:
        int sum = 0;
        
        for (int i=1; i<=n; ++i) {
            
            // total combination = num.of left * num.of right:
            sum += numTrees(i-1) * numTrees(n-i);            
        }
        
        this.cache[n] = sum;
        
        return this.cache[n];
    }
}