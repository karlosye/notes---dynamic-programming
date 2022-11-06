
// buy low and sell high; add up all the increment and return the sum;

class Solution {
    public int maxProfit(int[] prices) {
       
        // edge case: only 1 item
        if (prices.length == 1) {return 0;}
        
        int sumProfit = 0;
        
        int left = 0;
        int right = 1;
        
        while (right < prices.length) {
            
            if (prices[left] < prices[right]) {
                
                sumProfit = sumProfit + prices[right] - prices[left];
            }
            
            left++;
            right++;
        }
        
        return sumProfit;
    }
}