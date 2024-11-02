class Solution {
    public String mergeAlternately(String word1, String word2) {
    int m=word1.length();
    int n=word2.length();

    char[] s1= word1.toCharArray();
    char[] s2= word2.toCharArray();
    StringBuilder result=new StringBuilder();
     int i=0;
     int j=0;
     while(i<m||j<n){
        if(i<m){
            result.append(word1.charAt(i++));

        }
        if (j<n){
            result.append(word2.charAt(j++));
        }
        
     }
   
     return result.toString();
        
    }
}