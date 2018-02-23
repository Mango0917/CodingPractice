/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        char[] str=s.toCharArray();
        int left=0;
        int right=str.length-1;
        //int i=0;
        while(left<right){
            if(!set.contains(str[left])){
                left++;
            }
            else if(!set.contains(str[right])){
                right--;
            }
            else{
                char temp;
                temp=str[left];
                str[left]=str[right];
                str[right]=temp;
                left++;
                right--;
            }
        }
        return new String(str);
        
    }
}