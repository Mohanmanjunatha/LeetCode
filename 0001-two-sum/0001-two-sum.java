
// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         for(int j=0;j<nums.length;j++){
//             for (int i=j+1;i<nums.length;i++)
//             {
//                 int sum=nums[i]+nums[j];
//                 if(sum==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }

//         return new int[]{};
//     }
// }

// //Using HashMap

// class Solution{
    
// }

class Solution {

 

public int[] twoSum(int[] nums, int target) {

 

HashMap<Integer, Integer> map = new HashMap<>();

 

for (int i = 0; i < nums.length; i++) 

{

int num = nums[i];

int diff = target - num;

if (map.containsKey(diff)) 

{

return new int[] { map.get(diff), i };

}

map.put(num, i);

}

return new int[] {};

}

}





