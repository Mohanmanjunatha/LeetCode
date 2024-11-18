class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result; // All elements are 0 when k == 0
        }
        
        int start = k > 0 ? 1 : n + k;
        int end = k > 0 ? k : n - 1;
        int sum = 0;

        // Calculate the initial window sum
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }

        // Update result array using sliding window
        for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[(start++) % n];
            sum += code[(++end) % n];
        }

        return result;
    }
}
