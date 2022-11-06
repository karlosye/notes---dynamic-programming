
// buy low and sell high; loop through the array only once - use 2-pointers technique

class Solution {
    public int maxProfit(int[] prices) {
        
        // edge case: only 1 item:
        if (prices.length == 0) {return 0;}
        
        int left = 0;
        int right = 1;
        
        int maxProfit = 0;
        
        while (right < prices.length) {
            
            maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            
            if (prices[left] > prices[right]) {
                
                left = right;
            } 
            
            right++;            
        }

        return maxProfit;
    }
}