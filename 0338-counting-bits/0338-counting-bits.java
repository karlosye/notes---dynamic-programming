// brute force approach: loop through from 0 to n (inclusive); for every single item, find the number of 1 in its binary representation; appned this value to the res array

class Solution {
    public int[] countBits(int n) {
        
        int[] res = new int[n+1];
        
        // make a for loop:
        for (int i=0; i<=n; i++) {
            
            int numberOnes = 0;
            int number = i;
            
            // keep looping while number > 0:
            while (number != 0) {
                
                numberOnes += number%2;
                number = number/2;
            }
                
            res[i] = numberOnes;        
        }
        
        return res;
    }
}