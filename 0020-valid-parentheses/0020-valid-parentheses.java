// class Solution {
//     public boolean isValid(String s) {
//         if (s.isEmpty()){
//             return true;
//         }
//         int length;
//         do {
//             length=s.length();
//             s=s.replace("()","")
//                 .replace("[]", "")
//                 .replace("{}","");
//         }
//         while(length!=s.length());
//         return s.isEmpty();  
//         }
//     }

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> maps=new HashMap<Character,Character>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)){
                if(stack.empty()||stack.pop()!=maps.get(c))return false;
            }
            else
                stack.push(c);
        }
        return stack.empty();
    }
}

