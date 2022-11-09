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
    
    List<Integer> res = new ArrayList<Integer>();

    public List<Integer> postorder(Node root) {
        

        traverse(root);        
        
        return res;
    }
    
    public void traverse(Node node) {
        
        // edge case: null node
        if (node == null) {return;}
        
        if (node.children.size() != 0) {
            
            for (Node childNode:node.children) {
                
                traverse(childNode);
            }
        }
        
        res.add(node.val);
    }
    
}