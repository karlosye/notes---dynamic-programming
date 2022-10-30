// do not double count when mat.length is odd;

class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        
        int mid = mat.length/2;
        
        int sum = 0;
            
        // only write 1 for loop:
        for (int i=0; i<n; i++) {
            
            // add the first diagnol
            sum += mat[i][i];
            
            // add the second diagonal
            sum += mat[i][n-1-i];
        }
        
        if (n%2 != 0) {sum -= mat[mid][mid];}
        
        return sum;
    }
}