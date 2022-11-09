/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public List<Integer> res;
    
    public List<Integer> preorder(Node root) {
        
        res = new ArrayList<Integer>();
        
        traverse(root);
        
        return res;
    }
    
    public void traverse(Node _node) {
        
        // base case: null node
        if (_node == null) {return;}
        
        res.add(_node.val);
        
        // if it has children, then loop:
        if (_node.children.size() != 0) {
            
            for (Node childNode:_node.children) {
                
                traverse(childNode);
            }              
        }
        
    }
}