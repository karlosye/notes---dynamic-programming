// find the length(int) of the longest no-repeating characters;

// method: sliding windowf: left + right pointer; use a hashSet to check duplicate

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // initialization
        Set<Character> charSet = new HashSet<>();
        
        int left = 0;
        
        int res = 0;
        
        // loop through the String and update the right pointer:
        for (int right = 0; right<s.length(); right++) {
            
            // check if the charSet contains this character: remove and increment left pointer
            while (charSet.contains(s.charAt(right))) {
                
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // add the right to the charSet:
            charSet.add(s.charAt(right));
            res = Math.max(res, right-left+1);
        }
        
        return res;
    }
}