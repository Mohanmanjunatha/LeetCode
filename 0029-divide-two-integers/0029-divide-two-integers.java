class Solution {
    public int divide(int divident, int divisor) {

        if (divident==divisor)return 1;
        if (divident == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        if(divisor == 1) return divident;
        if (divident== -1) return -divident;
        int sign = 1;
        if (divident >0 && divisor<0) sign = -1;
        if (divident < 0 && divisor>0) sign = -1;
        long n = Math.abs((long)divident);
        long d = Math.abs((long)divisor);

        int ans =0;
        while(n>=d)
        {
            int p = 0;
            while(n >= d<<p)
            p++;

            p--;
            n -= d<<p;
            ans += 1<<p;
        }

        if (ans>=Math.pow(2,31) && sign==1) return Integer.MAX_VALUE;
        if (ans>=Math.pow(2,31) && sign==-1) return Integer.MIN_VALUE;

        return ans*sign;
    }
}