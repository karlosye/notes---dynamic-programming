// find the min. number in rotated sorted array; all the numbers are unique in the array; there are at least 1 item in the array

// approach: binary search - left&right pointer; use 2-pointers technique to find the sorted portion and return the leftmost value (min.value)

class Solution {
    public int findMin(int[] nums) {
        
        // init left/right pointer
        int left = 0;
        int right = nums.length - 1;
        
        int res = nums[0];
        
        while (left <= right) {
            
            // if this portion is already sorted:
            if (nums[left] < nums[right]) {
                
                res = Math.min(res, nums[left]);
                break;
            }
            
            // if this portion is not sorted: take the midpoint and contunue the binary search:
            int mid = (left + right)/2;
            res = Math.min(res, nums[mid]);
            
            // adjust the left/right pointer
            if (nums[mid] >= nums[left]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        
        return res;
    }
}