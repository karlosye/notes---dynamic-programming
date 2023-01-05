/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// use DFS: recursive function to return int[2]: withRoot and withoutRoot;

// withRoot = max(withoutRoot_left) + max(withoutRoot_right);
// withoutRoot = max(left) + max(right)

class Solution {
    public int rob(TreeNode root) {
        
        int[] res = this.dfs(root);
        
        return Math.max(res[0], res[1]);
    }
    
    // define the dfs method:
    public int[] dfs(TreeNode root) {
        
        // base case: null root
        if (root == null) {return new int[]{0,0};}
        
        // recursive case: find the with-without from left and right; then return the max
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        
        int withRoot = left[1] + right[1] + root.val;
        
        int leftMax = Math.max(left[0], left[1]);
        int rightMax = right[0] > right[1] ? right[0]:right[1];
        
        int withoutRoot = leftMax + rightMax;
        
        return new int[]{withRoot, withoutRoot};
    }
}