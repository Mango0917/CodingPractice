/*
Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
O(n^2)
*/
class Solution {
    int pos=0;
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        String num="";
        for(int i=pos;i<s.length();i++){
            if(s.charAt(i)!='[' && s.charAt(i)!=']' && !Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
            }
            else if(s.charAt(i)=='['){
                pos=i+1;
                String next=decodeString(s);
                for(int n=Integer.valueOf(num);n>0;n--){
                    sb.append(next);
                }
                num="";
                i=pos;
            }
            else if(s.charAt(i)==']'){
                pos=i;
                return sb.toString();
            }
        }
        return sb.toString();
    }
}