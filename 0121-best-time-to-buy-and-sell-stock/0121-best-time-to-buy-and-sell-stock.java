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



// class Solution {
//     public int maxProfit(int[] prices) {
//         int minprice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (prices[i] < minprice) {
//                 minprice = prices[i];  // Update minprice if the current price is lower
//             } else {
//                 maxProfit = Math.max(maxProfit, prices[i] - minprice);  // Calculate profit and update maxProfit
//             }
//         }

//         return maxProfit;  // Return the maximum profit found
//     }
// }


//Bruteforce 

//  class Solution{
//     public int maxProfit(int prices[]){

//         int maxprofit =0;
//         for (int i =0; i<prices.length-1;i++){
//             for (int j=i+1;j<prices.length;j++){
//                 int profit =prices[j]-prices[i];
//                 if (profit>maxprofit ){
//                     maxprofit =profit;
//                 }
//             }
//         }
//         return maxprofit;
//     } 
// }


//Optimal .
// here we keep 2 variables 
// profit and low . so we keep comparing the low to all upcoming variables to see if this is the lowest .
// then we keep comparing it with new values and update the profit to get the maximum .

// this happend in a single loop.

class Solution{
    public int maxProfit(int[] prices){
        int min=prices[0];
        int profit =0;
        for (int i=0;i< prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            profit =Math.max(profit ,prices[i]-min);

        }
        return profit;

    }
}











