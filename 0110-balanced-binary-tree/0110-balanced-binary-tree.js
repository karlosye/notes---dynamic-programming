/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isBalanced = function(root) {
    
    // h-balanced tree: left and right subtrees differ in height by no more than 1
    
    // DFS depth first search: recurse down the tree.
    // check if both left sub-tree and right sub-tree is balanced 
    
    let traverse = (node) => {
        
        // if node is null, then it is a height-balanced tree
        if (!node) {return [true,0]}
        
        let left = traverse(node.left);
        let right = traverse(node.right);
        
        let isBalanced = left[0] && right[0] && (Math.abs(left[1]-right[1])<=1);
        
        // return a pair [boolean, height]
        return [isBalanced, 1+Math.max(left[1],right[1])];
    }
    
    return traverse(root)[0];
};