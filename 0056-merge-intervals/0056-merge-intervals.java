class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on the start time
        // This ensures we can process intervals from left to right
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // LinkedList to store merged intervals
        // We use LinkedList so we can easily access the last merged interval
        LinkedList<int[]> merged = new LinkedList<>();
        // Step 2: Iterate through each interval
        for (int[] interval : intervals) {
            // If merged list is empty OR
            // current interval does not overlap with the last merged interval
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                // No overlap, so we can safely add the current interval
                merged.add(interval);
            } else {
                // There is an overlap with the last interval
                // Merge by extending the end time of the last interval
                merged.getLast()[1] = Math.max(
                    merged.getLast()[1],
                    interval[1]
                );
            }
        }
        // Step 3: Convert the merged LinkedList back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
