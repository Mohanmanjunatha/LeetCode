// consider gas =[1,2,3,4,5]
//.         cost=[3,4,5,1,2]
          //diff=[-2,-2,-2,3,3]
          // here we can see the cost for starting at 0-2 positions are negative and iwe cannot start at these position
//if you start at end it has to go through 3 stations negative in consecutive 
// this is not possible and only position left is 3
// when we are moving around. it moves only if Sum(gas)>=Sum(cost)
// if cost is more then we cannot move 

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }

        int total = 0;
        int res = 0;
        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);

            if (total < 0) {
                total = 0;
                res = i + 1;
            }
        }

        return res;
    }
}