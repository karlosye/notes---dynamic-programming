// find the container with most water;

// approach: maintain 2 pointers: left, right; at each iteration, compare the size and incre/decre the smaller one, and update the res

class Solution {
    public int maxArea(int[] height) {
        
        int res = 0;
        
        // init left + right pointer:
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            
            // area = width*height;
            int area = (right - left) * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            
            // compare:
            if (height[left] < height[right]) {
                
                left++;
                
            } else if (height[left] > height[right]) {
                
                right--;
                
            } else {
                
                right--;
            }         
        }
        
        return res;
    }
}