// class Solution {
//     public int triangleNumber(int[] nums) {
//         int count=0;
//         for (int i=0;i<nums.length-2;i++){
//             for (int j=i+1; i<nums.length-1;j++){
//                 for (int k=j+1;k<nums.length;k++){
//                     if (nums[i]+nums[j]>nums[k] &&
//                     nums[j]+nums[k]>nums[i] && nums[k]+nums[i]>nums[j]){
//                         count ++;
//                     }
//                 }
//             }
//         }
//         return count ;
//     }
// }
class Solution {
  public int triangleNumber(int[] nums) {
    int ans  = 0;
    if (nums.length < 3) return ans;
    Arrays.sort(nums);
    for (int i = 2; i < nums.length; i++) {
      int left = 0, right = i - 1;
      while (left < right) {
        if (nums[left] + nums[right] > nums[i]) {
          ans = ans+(right - left);
          right--;
        }
        else {
          left++;
        }
      }
    }
    return ans;
  }
}
  // TC : O(n2)
  // SC : O(1)