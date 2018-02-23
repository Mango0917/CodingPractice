/*
Implement a trie with insert, search, and startsWith methods.

Note:
You may assume that all inputs are consist of lowercase letters a-z.
Search-O(M)
M maximum string length
*/
class Trie {
    private TrieNode root;
    class TrieNode{
        boolean isEnd;
        TrieNode[] children;
        public TrieNode(){
            isEnd=true;
            children=new TrieNode[26];
        }
    }
    /** Initialize your data structure here. */
    public Trie() {     
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current=root;
        for(int i=0,L=word.length();i<L;i++){
            int id=word.charAt(i)-'a';
            if(current.children[id]==null){
                current.children[id]=new TrieNode();
                current.children[id].isEnd=false;
            }
            current=current.children[id];
        }
        current.isEnd=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search(word,1);    
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return search(prefix,2);
    }
    private boolean search(String str, int type){
        TrieNode current=root;
        int i=-1,L=str.length();
        while(++i<L){
            int id=str.charAt(i)-'a';
            if((current=current.children[id])==null)return false;
            
        }
        return type==1?current.isEnd:true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */