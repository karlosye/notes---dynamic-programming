// return the sum of 2 binary string: a + b
// approach: loop in the range of the longer string; if find nothing append a 0; return the res string in the end; (use a StringBuilder class)

// maintain a carry variable and initialize to 0

class Solution {
    public String addBinary(String a, String b) {

        StringBuilder res = new StringBuilder();
        
        int i = a.length()-1;
        int j = b.length()-1;
        
        int carry = 0;
        
        // make a while loop: loop from back to start
        while (i>=0 || j>=0) {
            
            int sum = carry;
            
            if (i>=0) {
                sum += a.charAt(i)-'0';
                i--;
            }
            
            if (j>=0) {
                sum += b.charAt(j)-'0';
                j--;
            }
            
            // update res: sum%2 is always 0 or 1
            res.append(sum%2);
            
            // update carry:
            carry = sum / 2;
        }
        
        // check if the carry is still 1 after the while loop:
        if (carry != 0) {res.append(carry);}
        
        return res.reverse().toString();
    }
}