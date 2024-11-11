class Solution {
    List<List<Integer>> response = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length && nums[i] <= 0) {
            if (i == 0 || nums[i] != nums[i-1])
                twoSum(nums, i + 1, -nums[i]);

            i++;
        }
        return response;
    }

    public void twoSum(int[] nums, int j, int target) {
        int k = nums.length - 1;
        while (j < k) {
            int sum = nums[j] + nums[k];
            
            if (sum < target)
                j++;
            else if (sum > target)
                k--;
            else {
                response.add(Arrays.asList(-target, nums[j++], nums[k--]));
                
                while (j < k && nums[j] == nums[j - 1]) j++;
            }

        }
    }
}