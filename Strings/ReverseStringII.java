/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        while(i<s.length()){
            
            j=i+k<=s.length()?i+k:s.length();
            res.append(new StringBuilder(s.substring(i,j)).reverse().toString());
            
            if(j>=s.length()) break;
            
            i=j;
            j=i+k<=s.length()?i+k:s.length();
            res.append(s.substring(i,j));
            i=j;
        }
        return res.toString();
    }
}