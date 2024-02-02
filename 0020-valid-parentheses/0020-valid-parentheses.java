class Solution {
    public boolean isValid(String s) {
 
        Stack<Character> LeftSymbols =new Stack<>();

        for (char c :s.toCharArray()){

            if (c=='(' || c=='{' || c== '['){
                LeftSymbols.push(c);
            }
         else if (c== ')' && !LeftSymbols.isEmpty() && LeftSymbols.peek()=='(' ){
             LeftSymbols.pop();
         }
            else if (c== '}' && !LeftSymbols.isEmpty() && LeftSymbols.peek()=='{' ){
             LeftSymbols.pop();
         }
            else if (c== ']' && !LeftSymbols.isEmpty() && LeftSymbols.peek()=='[' ){
             LeftSymbols.pop();
         }
         else {
             return false;
         }
        }

    return LeftSymbols.isEmpty();
        
    }
}