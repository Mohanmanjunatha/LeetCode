class Solution {
    public boolean isValid(String s) {

        if (s.isEmpty())
        {
            return true;
        }


        int length;
        do {
            length=s.length();
            s=s.replace("()","")
                .replace("[]", "")
                .replace("{}","");

        }while(length!=s.length());

        return s.isEmpty();




        
        }
    }


