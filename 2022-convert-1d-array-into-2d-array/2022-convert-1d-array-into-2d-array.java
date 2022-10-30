// r-> rows, c-> columns

class Solution {
    public int[][] construct2DArray(int[] nums, int r, int c) {
        
        int[][] res = new int[r][c];
        
        // check if the dimension is okay:
        if (nums.length != r*c) {
            
            return new int[0][0];
        }
        
        int rows = 0, cols = 0;
        
        // loop through the 1-d array, and add item into the res array:
        for (int i=0; i<nums.length; i++) {
            
            res[rows][cols] = nums[i];
            cols++;
            
            if (cols == c) {
                
                rows++;
                cols = 0;
            }
        }
        
        return res;        
    }
}