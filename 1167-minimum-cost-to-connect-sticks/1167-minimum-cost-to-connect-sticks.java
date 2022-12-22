// find the min.cost

// approach: sort the sticks array first; add all the item into the minHeap; poll 2 element from minHeap each time; then add back until minHeap is empty

class Solution {
    public int connectSticks(int[] sticks) {
        
        // edge case: only 1 stick:
        if (sticks.length == 1) {return 0;}
        
        Arrays.sort(sticks);
        
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        
        for (int number:sticks) {
            
            minPQ.add(number);
        };
        
        int cost = 0;
        
        // poll 2 element each time until it gets empty:
        while (!minPQ.isEmpty()) {
            
            int firstNumber = minPQ.poll();
            int secondNumber = minPQ.poll();
            
            int sum = firstNumber + secondNumber;
            cost += sum;
            
            if (!minPQ.isEmpty()) {
                
                minPQ.add(sum);
            }
        }
        
        return cost;
    }
}