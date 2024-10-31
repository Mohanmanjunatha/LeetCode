class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Temporary array to hold the merged elements
        int[] nums3 = new int[m + n];
        
        // Copy elements from nums1 to nums3
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        
        // Copy elements from nums2 to nums3
        for (int j = 0; j < n; j++) {
            nums3[m + j] = nums2[j];
        }
        
        // Sort the merged array
        Arrays.sort(nums3);
        
        // Copy the sorted elements back into nums1
        for (int k = 0; k < nums3.length; k++) {
            nums1[k] = nums3[k];
        }
    }
}
