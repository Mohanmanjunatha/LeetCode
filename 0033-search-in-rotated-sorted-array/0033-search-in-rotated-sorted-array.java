class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length; // Get the length of the array
        int left = 0, right = n - 1; // Initialize left and right pointers
        
        if (n == 0) return -1; // If the array is empty, return -1
        
        while (left <= right) { // Perform binary search until left and right pointers meet
            int mid = left + (right - left) / 2; // Calculate the mid index
            
            if (nums[mid] == target) return mid; // If target found at mid index, return mid
            
            if (nums[mid] >= nums[left]) { // If left half is sorted
                if (nums[left] <= target && target < nums[mid]) { // If target is within the left half
                    right = mid - 1; // Update right pointer
                } else {
                    left = mid + 1; // Update left pointer
                }
            } else { // If right half is sorted
                if (nums[mid] < target && target <= nums[right]) { // If target is within the right half
                    left = mid + 1; // Update left pointer
                } else {
                    right = mid - 1; // Update right pointer
                }
            }
        }
        
        return -1; // If target not found, return -1
    }
}
