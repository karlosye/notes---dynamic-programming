
// circular array; find next greater element

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] res = new int[nums.length];
        
        // try using a monotonic decreasing stack:
        Stack<Integer> stack = new Stack<>();
        
        // push all the element into the stack first:
        for (int i=nums.length-1; i>=0; i--) {
            
            stack.push(nums[i]);
        }
        
        // start comparing the nums element to the stack:
        for (int i=nums.length-1; i>=0; i--) {
            
            while (!stack.empty() && nums[i] >= stack.peek()) {
                
                stack.pop();
            }
            
            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        
        return res;
    }
}