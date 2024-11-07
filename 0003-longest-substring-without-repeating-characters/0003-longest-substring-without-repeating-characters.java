class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ca = s.charAt(i);

            // If character is already in the map, update the start to the next position after its last occurrence
            if (map.containsKey(ca)) {
                start = Math.max(start, map.get(ca) + 1);
            }

            // Update the character's position in the map
            map.put(ca, i);

            // Calculate the length of the current substring and update maxLength
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}

