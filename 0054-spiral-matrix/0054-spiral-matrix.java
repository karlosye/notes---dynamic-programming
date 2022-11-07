
// there is at least 1 row and 1 column.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        // create and maintain 4 boundary variables:
        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;
        
        List<Integer> res = new ArrayList<Integer>();
        
        // start the simulation process:
        while (left < right && top < bottom) {
            
            // go from left to right:
            for (int i=left; i<right; i++) {
                
                res.add(matrix[top][i]);
            }
            top++;
            
            // in the last column, go from top to bottom:
            for (int i=top; i<bottom; i++) {
                
                res.add(matrix[i][right-1]);
            }
            right--;
            
            // break condition:
            if (!(left < right && top < bottom)) {break;}
            
            // in the last row, go from right to left:
            for (int i=right-1; i>=left; i--) {
                
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            
            for (int i=bottom-1; i>=top; i--) {
                
                res.add(matrix[i][left]);
            }
            left++;
        }
        
        return res;
    }
}