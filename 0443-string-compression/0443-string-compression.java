class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;  // where we write compressed result
        int i = 0;      // read pointer
        while (i < n) {
            char currentChar = chars[i];
            int count = 0;
            // Count consecutive characters
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }
            // Write the character
            chars[write++] = currentChar;
            // Write count if greater than 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
