//sub optimal:
// remove non aqlpha elements. O(n)
//reverse the string and add it to new string O(n)
//compare these two
//TC=O(n) sc= O(n)

class Solution{
    public boolean isPalindrome(String s){
        
        if (s.isEmpty()){
            return true;
        }
         int i=0;
        int j=s.length()-1;
         while(i<j){
             char s1=s.charAt(i);
             char s2=s.charAt(j);
             
             if (!Character.isLetterOrDigit(s1)){
                 i++;
             }
             else if (!Character.isLetterOrDigit(s2)){
                 j--;
                 
             }     
             else{
                 if(Character.toLowerCase(s1)!=Character.toLowerCase(s2))
                 {
                     return false;
                 }
             i++;
             j--;
             }
         }
        return true;
    }
}







// class Solution {
//     public boolean isPalindrome(String s) {
//         if (s.isEmpty()) {
//         	return true;
//         }
//         int i = 0;
//         int j = s.length() - 1;
//         while(i <= j) {
//         	char currFirst = s.charAt(i);
//         	char currLast = s.charAt(j);
//         	if (!Character.isLetterOrDigit(currFirst )) {
//         		i++;
//         	} else if(!Character.isLetterOrDigit(currLast)) {
//         		j--;
//         	} else {
//         		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
//         			return false;
//         		}
//         		i++;
//         		j--;
//         	}
//         }
//         return true;
//     }
// }