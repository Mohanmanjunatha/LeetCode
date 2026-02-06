class Solution {
    public int shortestDistance(int[][] grid) {
        List<int[]> building = new ArrayList<>();
        int[][] num = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(num[i], 0);
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    building.add(new int[]{i, j});
                    grid[i][j] = -1;
                } else if (grid[i][j] == 2) {
                    grid[i][j] = -2;
                }
            }
        }
        int[][] offset = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        for (int[] bu : building) {
            Set<Pair<Integer, Integer>> visited = new HashSet<>();
            Queue<int[]> queue = new ArrayDeque<>();
            int count = 0;
            queue.offer(bu);
            visited.add(new Pair<Integer, Integer>(bu[0], bu[1]));
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int[] point = queue.poll();
                    if (count > 0) {
                        grid[point[0]][point[1]] += count;
                        num[point[0]][point[1]] += 1;
                    }
                    for (int j = 0; j < offset.length; j++) {
                        int ni = point[0] + offset[j][0];
                        int nj = point[1] + offset[j][1];
                        Pair<Integer, Integer> pair = new Pair(ni, nj);
                        if (ni >= 0 && ni < grid.length 
                        && nj >= 0 && nj < grid[0].length 
                        && grid[ni][nj] >= 0 
                        && !visited.contains(pair)) {
                            queue.offer(new int[]{ni, nj});
                            visited.add(pair);
                        }
                    }
                }
                count++;
            }
        }
        // get min
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (num[i][j] == building.size()) {
                    // if grid == 0, it means its unreachable
                    min = Math.min(min, grid[i][j]);
                } 
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}