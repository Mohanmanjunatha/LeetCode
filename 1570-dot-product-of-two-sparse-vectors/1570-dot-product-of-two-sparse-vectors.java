// import java.util.HashMap;
// import java.util.Map;
// class SparseVector {

//     Map<Integer, Integer> map;

//     // Constructor
//     SparseVector(int[] nums) {
//         map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 map.put(i, nums[i]);
//             }
//         }
//     }

//     // Static dot product method
//     public static int dotProduct(SparseVector v1, SparseVector v2) {

//         int result = 0;

//         // Iterate over smaller map (optimization)
//         if (v1.map.size() < v2.map.size()) {
//             for (int key : v1.map.keySet()) {
//                 if (v2.map.containsKey(key)) {
//                     result += v1.map.get(key) * v2.map.get(key);
//                 }
//             }
//         } else {
//             for (int key : v2.map.keySet()) {
//                 if (v1.map.containsKey(key)) {
//                     result += v1.map.get(key) * v2.map.get(key);
//                 }
//             }
//         }

//         return result;
//     }
// }


import java.util.HashMap;
import java.util.Map;

class SparseVector {

    private Map<Integer, Integer> map;

    // Constructor
    SparseVector(int[] nums) {
        map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                map.put(i, nums[i]);
            }
        }
    }

    // Dot product
    public int dotProduct(SparseVector vec) {

        int result = 0;

        // Iterate over smaller map for efficiency
        if (this.map.size() < vec.map.size()) {
            for (int key : this.map.keySet()) {
                if (vec.map.containsKey(key)) {
                    result += this.map.get(key) * vec.map.get(key);
                }
            }
        } else {
            for (int key : vec.map.keySet()) {
                if (this.map.containsKey(key)) {
                    result += this.map.get(key) * vec.map.get(key);
                }
            }
        }

        return result;
    }
}
