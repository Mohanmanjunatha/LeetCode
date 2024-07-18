// //exaustive
// class Solution {
//     public int rob(int[] nums) {
//         if(nums==null||nums.length==0) return 0;
//         if(nums.length<2) return nums[0];
//         return helper(nums,0,0);
        
//     }
    
//     private int helper(int[] nums, int idx, int amountrobbed){
//         //base
//         if (idx>=nums.length) return amountrobbed;
        
//         int case1= helper(nums, idx+2, amountrobbed+nums[idx]);
        
//         int case0=helper(nums, idx+1,amountrobbed);
//         return Math.max(case1,case0);
        
//     }
    
    
// }
// class Solution{

// public int rob(int[] nums) {

//  if (nums == null || nums.length == 0) return 0;

//  if (nums.length == 1) return nums[0];

//  if (nums.length == 2) return Math.max(nums[0], nums[1]);

//  int[] dp = new int[nums.length];

//  dp[0] = nums[0];

//  dp[1] = Math.max(nums[0], nums[1]);

//  for (int i = 2; i < nums.length; i++) {

//  dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);

//  }

//  return dp[nums.length - 1];

//  }
// }

class Solution{

public int rob(int[] nums) {

 if (nums == null || nums.length == 0) return 0;

 if (nums.length == 1) return nums[0];

 if (nums.length == 2) return Math.max(nums[0], nums[1]);

int n = nums.length;

 int prev = nums[0];

 int curr = Math.max(nums[0], nums[1]);

 for (int i = 2; i < nums.length; i++) {

int temp=curr;

curr=Math.max(curr, prev+nums[i]);

prev=temp;

 }

 return curr;

 }
}
 