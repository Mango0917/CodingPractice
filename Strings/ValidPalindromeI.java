/*
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
*/
class Solution {
    public boolean validPalindrome(String s) {
        if(s==null || s.length()==0) return true;
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                if(helper(s.substring(0,j)+s.substring(j+1))||helper(s.substring(0,i)+s.substring(i+1))) return true;    
                else return false;
            }
            
        }
        return true;
        
    }
    private boolean helper(String s){
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}