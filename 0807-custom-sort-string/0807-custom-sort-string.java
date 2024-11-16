//Hashmap to store all elements and their frequesncy
//loop through map to find the string using compare in hashmap and their frequesncy
// using that freq append them in an array
// remove that elements that has been added
//we iterate through key set toadd rest elements to array using append 
// its like getting each string
//finding that string in hashmap and getting its frequesncy 
// using that freq and looping to append that many characters
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
