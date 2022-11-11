
// return the time required for the kth person to finish

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int res = 0;   
        
        while (true) {
            
            for (int i=0; i<tickets.length; i++) {
                
                // if the person finish buying:
                if (tickets[i] == 0) {continue;}
                
                tickets[i]--;
                res++;
                
                if (tickets[k] == 0) {return res;}
            }
        }
    }
}