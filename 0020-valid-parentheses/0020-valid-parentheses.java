class Solution {
    public boolean isValid(String s) {

                if (s.isEmpty()) {
            return true;
        }

        // Loop until no more pairs can be found
        int length;
        do {
            length = s.length();
            // Remove all pairs from the string
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } while (length != s.length());  // Continue until length no longer changes

        // If the final string is empty, it means all pairs were matched correctly
        return s.isEmpty();
    }
        
    
}