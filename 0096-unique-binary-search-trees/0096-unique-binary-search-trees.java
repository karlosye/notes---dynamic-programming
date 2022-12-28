// BST: left val < root.val and right val > root.val
// recursive approach: dfs (top-down approach)

// use a for-loop to loop from i to n; imagine having each node as a root node -> left number of nodes = i-1 and right = n-i; then sum these up

class Solution {
    
    public int numTrees(int n) {
        
        // base case:
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // recursive case:
        int sum = 0;
        
        for (int i=1; i<=n; ++i) {
            
            // total combination = num.of left * num.of right:
            sum += numTrees(i-1) * numTrees(n-i);            
        }
        
        return sum;
    }
}