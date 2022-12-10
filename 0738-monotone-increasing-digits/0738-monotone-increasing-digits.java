// find the monotone increasing, then set the rest to 9

class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] arrN = String.valueOf(N).toCharArray();
        
        int monotoneIncreasingEnd = arrN.length - 1;
        for (int i = arrN.length - 1; i > 0; i--) {
            if (arrN[i] < arrN[i - 1]) {
                monotoneIncreasingEnd = i - 1;
                arrN[i - 1]--;
            }
        }
        
        for (int i = monotoneIncreasingEnd + 1; i < arrN.length; i++) {
            arrN[i] = '9';
        }
        
        return Integer.parseInt(new String(arrN));
    }
}