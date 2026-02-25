// public class Logger {
//     private Map<String, Integer> ok = new HashMap<>();
//     public boolean shouldPrintMessage(int timestamp, String message) {
//         if (timestamp < ok.getOrDefault(message, 0))
//             return false;
//         ok.put(message, timestamp + 10);
//         return true;
//     }
// }

import java.util.HashMap;
class Logger {
    private HashMap<String, Integer> map;
    public Logger() {
        map = new HashMap<>();
    }
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)) {
            map.put(message, timestamp + 10);
            return true;
        }
        if (timestamp >= map.get(message)) {
            map.put(message, timestamp + 10);
            return true;
        }
        return false;
    }
}