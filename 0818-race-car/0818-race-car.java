import java.util.*;

class Solution {
    public int racecar(int target) {
        Queue<State> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        queue.offer(new State(0, 0, 1)); // moves, position, speed

        while (!queue.isEmpty()) {
            State cur = queue.poll();

            int moves = cur.moves;
            int position = cur.position;
            int speed = cur.speed;

            if (position == target) {
                return moves;
            }

            String key = position + "," + speed;
            if (visited.contains(key)) {
                continue;
            }
            visited.add(key);

            // Accelerate
            queue.offer(new State(
                moves + 1,
                position + speed,
                speed * 2
            ));

            // Reverse (only when overshooting or moving away)
            if ((position + speed > target && speed > 0) ||
                (position + speed < target && speed < 0)) {

                int newSpeed = speed > 0 ? -1 : 1;
                queue.offer(new State(
                    moves + 1,
                    position,
                    newSpeed
                ));
            }
        }

        return -1; // should never happen
    }

    static class State {
        int moves;
        int position;
        int speed;

        State(int m, int p, int s) {
            moves = m;
            position = p;
            speed = s;
        }
    }
}
