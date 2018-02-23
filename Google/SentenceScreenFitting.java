/*
Given a rows x cols screen and a sentence represented by a list of non-empty words, find how many times the given sentence can be fitted on the screen.

Note:

A word cannot be split into two lines.
The order of words in the sentence must remain unchanged.
Two consecutive words in a line must be separated by a single space.
Total words in the sentence won't exceed 100.
Length of each word is greater than 0 and won't exceed 10.
1 ≤ rows, cols ≤ 20,000.
Example 1:

Input:
rows = 2, cols = 8, sentence = ["hello", "world"]

Output: 
1

Explanation:
hello---
world---

The character '-' signifies an empty space on the screen.
Example 2:

Input:
rows = 3, cols = 6, sentence = ["a", "bcd", "e"]

Output: 
2

Explanation:
a-bcd- 
e-a---
bcd-e-

The character '-' signifies an empty space on the screen.
Example 3:

Input:
rows = 4, cols = 5, sentence = ["I", "had", "apple", "pie"]

Output: 
1

Explanation:
I-had
apple
pie-I
had--

The character '-' signifies an empty space on the screen.
*/
/*
Reformatted sentence
["ab", "cde", "f"] --> "ab cde f "
count: how many characters of the reformatted sentence is on the screen
count % length of reformatted sentence: the starting position of the next row
Answer: count / length of reformatted sentence
length: 9
count = (3 + 4 + 5 + 4 + 5) / 9 = 2
row 5
col 4
ab cde f ab cde f ab cde f....
XXX
   XXXX
       XXXXX
            XXXX
                XXXXX
                
*/
class Solution {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        
        String s=new String();
        for(String c:sentence){
            s+=c;
            s+=" ";
        }
        int len=s.length();
        int count=0;
        for(int i=0;i<rows;i++){
            count+=cols;
            if(s.charAt(count%len)==' '){
                ++count;
            }
            else{
                while(count>0 && s.charAt((count-1)%len)!=' '){
                    --count;
                }
            }
        }
        return count/len;
        
        
    }
}