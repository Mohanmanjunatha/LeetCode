//we add everything to map
//check for each value and make a loop and print them
// create one more loop to print rest

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c =s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        StringBuilder result=new StringBuilder();

        for(int i=0;i<order.length();i++){
            char c=order.charAt(i);
            if (map.containsKey(c)){
                int count=map.get(c);
                for (int k=0;k<count;k++){
                    result.append(c);
                }
                map.remove(c);
            }

        }


        for (char c:map.keySet()){
            int count=map.get(c);
            for (int k=0;k<count;k++){
                result.append(c);
            }
            //map.remove(c);
        }



        return result.toString();




        

    }
}
