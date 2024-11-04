// class Solution {
//     public boolean isValid(String s) {
        // if (s.isEmpty()){
        //     return true;
        // }
        // int length;
        // do {
        //     length=s.length();
        //     s=s.replace("()","")
        //         .replace("[]", "")
        //         .replace("{}","");
        // }
        // while(length!=s.length());
        // return s.isEmpty();  
        // }
//     }
//Optimized
//checking if its open bracket then add it to stack
// if its not open then it must be close bracket
//we check here since to push a closed bracket there must be open present if not then exit
//it should be empty at the end

class Solution {
    public boolean isValid(String s) {

        HashMap<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (!map.containsKey(c)){
                stack.push(c);
                
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if (top!=map.get(c)){
                    return false;
                }
            }
        }

       return stack.isEmpty();
    }
}


