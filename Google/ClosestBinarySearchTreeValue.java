/*
Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:
Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.

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
    public int closestValue(TreeNode root, double target) {
        int ret=root.val;
        TreeNode node=root;
        while(node!=null){
            if(Math.abs(target-node.val)<Math.abs(target-ret)){
                ret=node.val;
            }
            node=node.val>target?node.left:node.right;
        }
        return ret;
    }
}