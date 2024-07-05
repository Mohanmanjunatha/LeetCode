//  class Solution {
// public List<List<String>> groupAnagrams(String[] s)
// {
//  List<List<String>> result= new ArrayList<>(); //creating an array list to store the similar string

//     if (s== null || s.length==0) return result;// checking if the string length is zero or if string is null

//     HashMap<String, List<String>> map=new HashMap<>(); //. create a hashmap to store both the key and value 

//     for (int i=0;i<s.length;i++)   // iterate through the String to get the small string in each index to preform the operation
//     {
//         String str=s[i];            //initialising a string to get a strings from each position of big string
//         char[] charArr=str.toCharArray();// convrting tis small string to character array 
//         Arrays.sort(charArr);   // Sorting this array
//         String sorted=String.valueOf(charArr);  //after sorting converting back to string 
//         if(!map.containsKey(sorted))   // checking if this sorted string present in map or not 
//         {
//             map.put(sorted, new ArrayList<>()); // if not present we are putting this to map

//         }
//         map.get(sorted).add(str);// else if the string already present then we wll add this to arraylist

//     }
//     return new ArrayList<>(map.values());
// }
// }

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res = new HashMap<>();

        // Traditional for loop to iterate over the array strs

        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];

            int[] count = new int[26];

            // Count the frequency of each character in the string

            for (int j = 0; j < s.length(); j++) {

                char c = s.charAt(j);

                count[c - 'a']++;

            }

            // Build the key based on character frequencies

            StringBuilder sb = new StringBuilder();

            for (int k = 0; k < 26; k++) {

                sb.append('#');

                sb.append(count[k]);

            }

            String key = sb.toString();

            

            // Store the string in the map based on the key

            if (!res.containsKey(key)) {

                res.put(key, new ArrayList<>());

            }

            res.get(key).add(s);

        }

        // Return the grouped anagrams as a list of lists

        return new ArrayList<>(res.values());

    }

}
