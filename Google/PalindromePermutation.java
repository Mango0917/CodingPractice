/*
Given a string, determine if a permutation of the string could form a palindrome.

For example,
"code" -> False, "aab" -> True, "carerac" -> True.


*/
class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> map=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(!map.contains(s.charAt(i))){
                map.add(s.charAt(i));
            }    
            else{
                map.remove(s.charAt(i));
            }
        }
        return map.size()==0|| map.size()==1;
        
       
    }
}