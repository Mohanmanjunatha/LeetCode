// Example with 12321:
// After reversing half, we get x = 12 and revertedNumber = 123.
// Since x == revertedNumber / 10 (12 == 123 / 10), we confirm it’s a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 ||(x%10==0 && x!=0)){
            return false;
        }

        int reversed=0;
        int temp=x;

        while(temp!=0){
            int digit=temp%10;
            reversed=reversed*10+digit;
            temp=temp/10;
        }

        return (x==reversed);


    }
}