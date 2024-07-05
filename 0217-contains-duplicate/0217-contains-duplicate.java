//1)//bruteforce 
//tc=o(N*N)
//sc=O(1)

//Better Approach

//2)//sort the array  and save time since we get result early 

//TC=O(nlogn)
//sc=O(1)

//3)//if we can compromise some space then hashset works better in O(1)
//check in hashset if the element contains// if not add it

class Solution{
    public boolean containsDuplicate(int[] nums){
        Set<Integer> Uniques=new HashSet<>();
        
        for (int i=0;i<nums.length;i++){
            if(Uniques.contains(nums[i]))
            {
                return true;
            }  
            else 
                Uniques.add(nums[i]);
        }
        return false;
    }
}