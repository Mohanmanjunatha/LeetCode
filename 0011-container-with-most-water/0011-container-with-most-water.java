class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxarea=0,carea;
        while(l<r)
        {
          if(height[l]<=height[r])
            {
                carea=height[l]*(r-l);
                l++;
            }
            else
            {
                carea=height[r]*(r-l);
                r--;
            }
            maxarea=Math.max(maxarea,carea);
        }
        return maxarea;  
    }
}