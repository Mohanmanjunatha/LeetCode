class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int currentMin = nums[0];
        int currentMax = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            currentMax = Math.max(cur, currentMax * cur);
            currentMin = Math.min(cur, currentMin * cur);
            
            result = Math.max(result, currentMax);
        }
        
        return result;
    }
}
