/*
 All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].

*/
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen=new HashSet<>();
        Set<String> repeated=new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
            String ten=s.substring(i,i+10);
            if(seen.contains(ten)){
               repeated.add(ten); 
            }
            else{
                seen.add(ten);
            }
        }
        return new ArrayList(repeated);
    }
}