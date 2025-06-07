// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currsum=0;
//         int maxSum=nums[0];

//         for (int i=0;i<nums.length;i++){
//             if (currsum<0){
//                 currsum=0;
//             }
//             currsum=currsum+nums[i];
//             maxSum=Math.max(currsum,maxSum);

//         }
//         return maxSum;
        
//     }
// }


class Solution{
    public int maxSubArray(int[] nums){

        int currsum=0;
        int currMax=nums[0];

        for (int i=0;i<nums.length;i++){
            if (currsum<0){
                currsum=0;

            }
            currsum+=nums[i];
            currMax=Math.max(currsum,currMax);

        }

        return currMax;


    }
}