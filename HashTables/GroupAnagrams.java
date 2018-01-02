/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            String keystr=String.valueOf(ca);
            if(!map.containsKey(keystr)){
                map.put(keystr, new ArrayList<String>());
            }
            map.get(keystr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}