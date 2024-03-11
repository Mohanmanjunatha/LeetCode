/*
    Time Complexity: O(n + m), where n is the length of the input array `nums`, and m is the maximum value in `nums`.
                     This is because we iterate over the `nums` array twice - once to find the maximum value and 
                     once to populate the `arr` array. The subsequent loop that calculates the maximum points has
                     a linear time complexity O(m).
                     
    Space Complexity: O(m), where m is the maximum value in the input array `nums`.
                      This is because we create an array `arr` of size `max + 1`, where `max` is the maximum value
                      in `nums`.
*/

class Solution {
    public int deleteAndEarn(int[] nums) {
        // base case
        if (nums == null || nums.length == 0) return 0;
        
        // Find the maximum value in the input array
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        // Create an array to store the sum of values corresponding to each number in the input array
        int[] arr = new int[max + 1];
        for (int num : nums) {
            arr[num] += num;
        }
        
        // Use a modified version of the house robber algorithm
        // Keep track of the maximum points earned at each step
        int prev = arr[0];
        int curr = arr[1];
        for (int i = 2; i < arr.length; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + arr[i]);
            prev = temp;
        }
        // Return the maximum points earned
        return curr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 4, 2};
        System.out.println("Maximum points after deleting and earning: " + solution.deleteAndEarn(nums));
    }
}
