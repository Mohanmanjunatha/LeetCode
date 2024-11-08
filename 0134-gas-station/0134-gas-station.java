class Solution {
    //Greedy Approach of O(n)
    //if the sum of gas array is less than the sum of cost array, then it's invalid
    //else, we know we have a solution 
    //we can just have one for loop and check the difference of gas[i]-cost[i] 
    //if the total is less than zero, we move on the the next element and reset total to 0
    // until we found a positive total and that will be our starting point 
    // diff[-2,-2,-2,3,3]
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumOfGas = 0;
        int sumOfCost = 0;
        for(int i=0; i< gas.length;i++){
            sumOfGas += gas[i];
            sumOfCost += cost[i];
        }
        if (sumOfGas < sumOfCost){
            return -1;
        }
        int total = 0;
        int result = 0;
        for(int i=0; i< gas.length;i++){
            total += (gas[i] - cost[i]);
            if (total<0){
                total = 0;
                result = i+1;
            }
        }
        return result;
    }
}