/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
         List<List<Integer>> result=new LinkedList<List<Integer>>();
        
        if(root==null) return result;
        queue.add(root);
       
        while(!queue.isEmpty()){
            int level=queue.size();
            
            List<Integer> res=new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                res.add(queue.poll().val);
            }
            result.add(res);
        }
        return result;
    }
}