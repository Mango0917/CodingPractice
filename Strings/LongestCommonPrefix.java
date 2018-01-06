/*
Write a function to find the longest common prefix string amongst an array of strings.
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1 ) return "";
        if(strs.length==1){
            return strs[0];
        }
        int shortest=0;
        int len=strs[0].length();
        for(int i=0;i<strs.length;i++){
            int currlen=strs[i].length();
            if(currlen<len){
                len=currlen;
                shortest=i;
            }
        }
        String sub = strs[shortest];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(sub) != 0) {
                sub = sub.substring(0, sub.length()-1);
            }
        } 
        return sub;
    }
}