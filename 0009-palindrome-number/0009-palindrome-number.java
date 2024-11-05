// Example with 12321:
// After reversing half, we get x = 12 and revertedNumber = 123.
// Since x == revertedNumber / 10 (12 == 123 / 10), we confirm it’s a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
       if (x<0 || (x%10 ==0 && x!=0)){
        return false;
       }
       int reverse=0;
       while(x>reverse){
        reverse=reverse*10+(x%10);
        x=x/10;
       }
       return x==reverse||x==reverse/10;
        
    }
}