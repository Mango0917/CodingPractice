/*
You need to find the largest value in each row of a binary tree.

Example:
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int temp=queue.peek().val;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                temp=Math.max(node.val,temp);
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
            result.add(temp);
        }
        return result;
        
    }
}