/*
Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

Note: The length of path between two nodes is represented by the number of edges between them.

Example 1:

Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:

2
Example 2:

Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output:

2
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
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans=0;
        if(root==null) return 0;
        help(root);
        return ans;
    }
    public int help(TreeNode node){
        if(node==null) return 0;
        int left=help(node.left);
        int right=help(node.right);
        int arrowleft=0, arrowright=0;
        if(node.left!=null && node.left.val==node.val){
            arrowleft+=left+1;
        }
        if(node.right!=null && node.right.val==node.val){
            arrowright+=right+1;
        }
        ans=Math.max(ans, arrowleft+arrowright);
        return Math.max(arrowleft,arrowright);
    }
}

