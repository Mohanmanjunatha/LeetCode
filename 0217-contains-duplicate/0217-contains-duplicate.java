// class Solution {
//     public boolean containsDuplicate(int[] nums) {
  
//      HashMap<Integer, Boolean> map =new HashMap<>();


//      for (int i=0;i<nums.length;i++){
//         int num=nums[i];

//         if (map.containsKey(num)){
//             return true;
//         }

//           map.put(num,true);
//      }

     
//      return false;



//     }
//}
// class Solution {
// public boolean containsDuplicate(int[] nums) {
//     Set<Integer> set = new HashSet<>(nums.length);
//     for (int x: nums) {
//         if (set.contains(x)) return true;
//         set.add(x);
//     }
//     return false;
// }
// }

//May22


//bruteforce :

// class Solution{
//     public boolean containsDuplicate(int[] nums){

//         for (int i=0;i<nums.length-1;i++){
//             for (int j=i+1; j<nums.length;j++){
//                 if (nums[i]==nums[j]){
//                     return true;
//                 }

//             }

//         }
//         return false;
//     }
// }


//Optimal
class Solution{
    public boolean containsDuplicate(int[] nums){
        Set<Integer> visited= new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(visited.contains(nums[i])){
                return true;
            }
            visited.add(nums[i]);
        }
        return false;
    }
}
















