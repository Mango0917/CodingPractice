/*
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
*/
class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters=new int[26];
        for(int i=0;i<s.length();i++){
            letters[s.charAt(i)-'a']++;
        }
    
        for(int j=0;j<t.length();j++){
            letters[t.charAt(j)-'a']--;
            if(letters[t.charAt(j)-'a']<0){
                return t.charAt(j);
            }
        }
        return 0;
        
    }
}