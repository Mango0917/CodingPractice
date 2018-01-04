/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
*/
class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
       
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                upper++;
            }
        }
        boolean flag=false;
        if(upper==1){
            if(Character.isUpperCase(word.charAt(0))){
                flag=true;
            }
        }
        if(flag==true || upper==word.length() || upper==0){
            return true;
        }
        else
            return false;
        
    }
}