/*
Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output: 
"apple"
Example 2:
Input:
s = "abpcplea", d = ["a","b","c"]

Output: 
"a"
*/
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res="";
        for(String w:d){
            if(isSequence(w,s)){
                if(w.length()>res.length()) res=w;
                if(w.length()==res.length() && w.compareTo(res)<0) res=w;
            }    
        }
        return res;
    }
    boolean isSequence(String w, String s){
        char[] warr=w.toCharArray();
        char[] sarr=s.toCharArray();
        int i=0,j=0;
        while(i<warr.length && j<sarr.length){
            if(warr[i]==sarr[j])i++;
            j++;
        }
        return i==warr.length;
    }
}