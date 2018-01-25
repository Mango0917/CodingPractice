/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        if(root==null) return result;
        if(root.left==null && root.right==null){
            result.add(Integer.toString(root.val));
            return result;
        }
        for(String s:binaryTreePaths(root.left)){
            result.add(Integer.toString(root.val)+"->"+s);
        }
        for(String s:binaryTreePaths(root.right)){
            result.add(Integer.toString(root.val)+"->"+s);
        }
        return result;
    }
}