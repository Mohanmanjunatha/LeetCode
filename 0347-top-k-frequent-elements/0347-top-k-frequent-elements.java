import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!m.containsKey(n)) {
                m.put(n, 1);
            } else {
                m.put(n, m.get(n) + 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> m.get(b) - m.get(a));
        for (Integer key : m.keySet()) {
            pq.add(key);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;
    }
}