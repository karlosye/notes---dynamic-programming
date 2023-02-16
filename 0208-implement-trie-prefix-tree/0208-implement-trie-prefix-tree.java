// implement a trie; all the letters are lowercase a-z

// create a node class:
class Node {
    
    Map<Character, Node> children;
    boolean isCompleteWord;
    
    // constructor:
    public Node() {
        
        this.children = new HashMap<>();
        this.isCompleteWord = false;
    }
}

// implememt 3 approaches: insert, search, startsWith
class Trie {

    Node root;
    
    // constructor: init a root node
    public Trie() {
        this.root = new Node();
    }
    
    public void insert(String word) {
        
        // maintain a currNode pointer:
        Node currNode = this.root;
        
        // loop through the entire word, add and update currNode
        for (int i=0; i<word.length(); i++) {
            
            // check if the child contains the character:
            if (!currNode.children.containsKey(word.charAt(i))) {
                
                currNode.children.put(word.charAt(i), new Node());
                currNode = currNode.children.get(word.charAt(i));
            } else {

                currNode = currNode.children.get(word.charAt(i));                                
            }
        }
        
        currNode.isCompleteWord = true;
    }
    
    public boolean search(String word) {
        
        // search a complete word and update the pointer; return a boolean value
        Node currNode = this.root;
        
        for (int i=0; i<word.length(); i++) {
            
            if (!currNode.children.containsKey(word.charAt(i))) {
                return false;
            }
            
            currNode = currNode.children.get(word.charAt(i));
        }
        
        return currNode.isCompleteWord;
    }
    
    public boolean startsWith(String prefix) {
        
        // similar to the search method:
        Node currNode = this.root;
        
        for (int i=0; i<prefix.length(); i++) {
            
            if (!currNode.children.containsKey(prefix.charAt(i))) {
                
                return false;
            }
            
            // update the pointer:
            currNode = currNode.children.get(prefix.charAt(i));
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */