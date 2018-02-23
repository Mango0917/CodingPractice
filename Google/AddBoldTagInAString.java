/*
Given a string s and a list of strings dict, you need to add a closed pair of bold tag <b> and </b> to wrap the substrings in s that exist in dict. If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag. Also, if two substrings wrapped by bold tags are consecutive, you need to combine them.
Example 1:
Input: 
s = "abcxyz123"
dict = ["abc","123"]
Output:
"<b>abc</b>xyz<b>123</b>"
Example 2:
Input: 
s = "aaabbcc"
dict = ["aaa","aab","bc"]
Output:
"<b>aaabbc</b>c"
O(n^3)
*/
class Solution {
    public String addBoldTag(String s, String[] dict) {
        int n = s.length();
        boolean[] marked = new boolean[n];
        for (String word : dict) {
            int m = word.length();
            for (int i=0;i<=n-m;i++) 
                if (s.substring(i, i + m).equals(word)) 
                    for (int j=i;j<i+m;j++) marked[j] = true;
        }

        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < n) {
            if (marked[i]) {             
              int j = i;
              while (j < n && marked[j]) j++;
              res.append("<b>").append(s.substring(i,j)).append("</b>");
              i = j;                 
            }
            else res.append(s.charAt(i++));
        }

        return res.toString();      
    }
}