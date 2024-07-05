//sol1
//sort each string and compare them
//TC=O(nlogn)

//base case
//make sure both srings have same length
//creeate a hashmap adda the key value pairs
//compare both of them and they both should have same values for each key
//TC=O(S+T), SC=O(S+T)

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;   
        }
        int[] store= new int[26];
    
        for (int i=0;i<s.length();i++){
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;  
        }
        for(int i=0;i<store.length;i++)
        {
            if (store[i]!=0) 
        return false;     
}
        return true;
        
        
    }
}