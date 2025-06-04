class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] answer = new int[n];

    // Step 1: Calculate left products
    answer[0] = 1; // nothing to the left of index 0
    for (int i = 1; i < n; i++) {
        answer[i] = nums[i - 1] * answer[i - 1];
    }

    // Step 2: Calculate right products on the fly and update answer
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * rightProduct;
        rightProduct *= nums[i];
    }

    return answer;
}

}