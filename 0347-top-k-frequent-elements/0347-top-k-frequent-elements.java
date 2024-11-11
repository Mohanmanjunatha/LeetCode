
// use hashmap and priority queue
// will do it through Hashmap 
//we will checka and add the elements
// we could have taken the freq of count from hashmap but think if we have all elements with same count ?
// we will use priority queue to maintain the decending order
//then we add the keys to queue
//then will create an array to add the top frequesnt elements in that array and retrun


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