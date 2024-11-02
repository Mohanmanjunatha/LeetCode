// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxpro=0;

//         for (int i=0;i<prices.length-1;i++){
//             for (int j=i+1;j<prices.length;j++){
//                 int profit =prices[j]-prices[i];
//                 if (profit>maxpro)
//                 maxpro=profit;
//             }
//         }
//         return maxpro;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];  // Update minprice if the current price is lower
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minprice);  // Calculate profit and update maxProfit
            }
        }

        return maxProfit;  // Return the maximum profit found
    }
}
