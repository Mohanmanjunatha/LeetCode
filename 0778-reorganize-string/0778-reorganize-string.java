class Solution {
    public String reorganizeString(String s) {
        // Step 1: Create a frequency map
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Create a max-heap (priority queue)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(new int[]{i, freq[i]});
            }
        }

        // Step 3: Check if reorganization is possible
        if (maxHeap.peek()[1] > (s.length() + 1) / 2) {
            return ""; // Not possible to reorganize
        }

        // Step 4: Build the result string
        StringBuilder result = new StringBuilder();
        int[] prev = null;

        while (!maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            result.append((char) (current[0] + 'a')); // Add the current character

            // Push the previous character back into the heap if it still has a frequency
            if (prev != null && prev[1] > 0) {
                maxHeap.offer(prev);
            }

            // Update the current character's frequency
            current[1]--;
            prev = current;
        }

        return result.toString();
    }
}
