public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Initialize arrays to store products to the left and right of each index
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        
        // Initialize result array
        int[] result = new int[n];
        
        // Calculate products to the left of each index
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Calculate products to the right of each index
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // Calculate the final result
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 24 12 8 6
    }
}
