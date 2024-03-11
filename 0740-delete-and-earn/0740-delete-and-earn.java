class Solution {
    public int deleteAndEarn(int[] nums) {
        // base case
        if (nums==null||nums.length==0)return 0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
            
        }
        int[] arr=new int[max+1];
        for(int num:nums){
            arr[num]+=num;
            
        }
        //arr-> house robber
        int prev=arr[0];
        int curr=arr[1];
        for (int i=2;i<arr.length;i++){
            int temp=curr;
            curr=Math.max(curr,prev+arr[i]);
            prev=temp;
        }
        return curr;
        
        
    }
}