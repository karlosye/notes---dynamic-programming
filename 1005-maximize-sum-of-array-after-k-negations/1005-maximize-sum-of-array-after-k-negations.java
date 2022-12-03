// use minHeap to solve this question

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        // turn the nums array into a minHeap first:
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int sum = 0;
        
        // iteratively, add the nums item and track the sum:
        for (int number:nums) {
            
            minHeap.add(number);
            sum += number;
        }        
        
        // keep pop and add until k=0
        while (k != 0) {
            
            int number = minHeap.poll();
            
            sum = sum-number;
            sum = sum+(-number);
            
            minHeap.add(-number);
            k--;
        }
        
        return sum;
    }
}