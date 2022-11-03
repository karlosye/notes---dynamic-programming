class Solution {
    public int getMaxLen(int[] nums) {
        
        // iterate through the array to the right. Update pos_length, neg_length, ans:
        
        int ans = 0;
        int posLength = 0, negLength = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            // if see zero, reset:
            if (nums[i] == 0) {
            
                posLength = 0;
                negLength = 0;
            } 
            
            // if greater than zero:
            else if (nums[i] > 0) {
                
                posLength++;
                negLength = negLength == 0? 0: negLength + 1 ;
            }
            
            // if less than zero, swap then plus one:
            else {
                
                int temp = posLength;
                posLength = negLength == 0? 0 : negLength + 1;
                negLength = temp + 1;
            }
            
            // update the ans variable:
            ans = Math.max(posLength, ans);
        }
        
        return ans;
    }
}