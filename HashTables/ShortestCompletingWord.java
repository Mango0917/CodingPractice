/*Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a word is said to complete the given string licensePlate

Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.

It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.

The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate, but the word "supper" does.

Example 1:

Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
Output: "steps"
Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
Note that the answer is not "step", because the letter "s" must occur in the word twice.
Also note that we ignored case for the purposes of comparing whether a letter exists in the word.

Example 2:

Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
Output: "pest"
Explanation: There are 3 smallest length words that contains the letters "s".
We return the one that occurred first.
*/

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String lp=licensePlate.toLowerCase();
        int[] map=new int[26];
        for(int i=0;i<lp.length();i++){
            if(Character.isLetter(lp.charAt(i))){
                map[lp.charAt(i)-'a']++;
            }
        }
        int minlen=Integer.MAX_VALUE;
        String result=null;
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            
            if(matches(word,map) && word.length()<minlen){
                System.out.println("Here");
                minlen=word.length();
                result=words[i];
                
            }
        }
        return result;
    }
    public boolean matches(String word, int[] map){
        int[] map2=new int[26];
        for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i))) map2[word.charAt(i)-'a']++;
        }
      
        
        for(int i=0;i<26;i++){
            if(map[i]!=0 && map2[i]<map[i]) return false;
        }
        return true;
    }
}