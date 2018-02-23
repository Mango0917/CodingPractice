/*
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> list=new LinkedList<>();
        if(digits.isEmpty()) return list;
        list.add("");
        for(int i=0;i<digits.length();i++){
            int x=Character.getNumericValue(digits.charAt(i));
            while(list.peek().length()==i){
                String t=list.remove();
                for(char c:mapping[x].toCharArray()){
                    list.add(t+c);   
                }
            }
        }
        return list;
    }
}