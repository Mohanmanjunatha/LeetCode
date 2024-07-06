class Solution {

    public boolean isValid(String s) {

        HashMap<Character, Character> mappedBrackets = new HashMap<>();

        mappedBrackets.put(')', '(');
        mappedBrackets.put('}', '{');
        mappedBrackets.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!mappedBrackets.containsKey(c)) { // Checking if it's an open bracket, then add it to stack
                stack.push(c); // If it's not open, then it must be a closed bracket
            } else {
                // We check here since to push a closed bracket, there must be an open present. If not, exit
                if (stack.isEmpty()) {
                    return false;
                }

                char topElement = stack.pop();
                if (topElement != mappedBrackets.get(c)) { // Use equality operator here
                    return false;
                }
            }
        }
        return stack.isEmpty(); // It should be empty at the end
    }
}
