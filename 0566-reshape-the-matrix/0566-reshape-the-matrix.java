class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][] output = new int[r][c];
        
        // check if range is okay:
        if (mat.length * mat[0].length != r*c) {
            
            return mat;
        }
        
        int rows = 0, cols = 0;
        
        // loop through each item in mat matrix and add the item into the output array:
        for (int i=0; i<mat.length; i++) {
            
            for (int j=0; j<mat[0].length; j++) {
                
                output[rows][cols] = mat[i][j];
                cols++;
                
                // when each colum is filled:
                if (cols == c) {
                    
                    rows++;
                    cols = 0;
                }
            }
        }
        
        return output;
    }
}