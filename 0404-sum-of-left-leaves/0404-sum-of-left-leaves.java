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

// find the sum of LEFT leaves: Depth first search

class Solution {
    
    int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        // base case:
        if (root == null) {return 0;}
        
        // if left child node:
        if (root.left != null && root.left.left == null && root.left.right == null) {
            
            sum = sum + root.left.val;
        }
        
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return sum;
    }
}