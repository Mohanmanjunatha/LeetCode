public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res=new HashMap<>();

        for (String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorteds =new String(charArray);
            res.putIfAbsent(sorteds, new ArrayList<>());
            res.get(sorteds).add(s); 


        }
        return new ArrayList<>(res.values());


      
    }
}