// must do this in space complexity: O(n^2)

// approach: create a maxHeap; add each element into the heap; if heap.size() > k, poll from the heap

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> maxPQ =  new PriorityQueue<>(
            (number1, number2) -> number2 - number1
        );
        
        for (int i=0; i<matrix.length; i++) {
            
            for (int j=0; j<matrix[0].length; j++) {
                
                maxPQ.add(matrix[i][j]);
                
                if (maxPQ.size() > k) {maxPQ.poll();}
            }
        }
        
        return maxPQ.peek();
    }
}