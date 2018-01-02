/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],

   1
    \
     2
    /
   3

return [1,3,2]. 


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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stck=new Stack<>();
        if(root==null) return result;
        TreeNode curr=root;
        
        while(curr!=null || !stck.isEmpty()){
            while(curr!=null){
                stck.push(curr);
                curr=curr.left;
            }
            curr=stck.pop();
            result.add(curr.val);
            curr=curr.right;
        }
        return result;
    }
}