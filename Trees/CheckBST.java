/*
A program to check if a binary tree is BST or not
A binary search tree (BST) is a node based binary tree data structure which has the following properties.
• The left subtree of a node contains only nodes with keys less than the node’s key.
• The right subtree of a node contains only nodes with keys greater than the node’s key.
• Both the left and right subtrees must also be binary search trees.

From the above properties it naturally follows that:
• Each node (item in the tree) has a distinct key.

*/
public class BinaryTree{
    boolean isBST(Node root){
        return isBSTUtil(root,Integer.MIN_VALUE, Integer.MAX_VALUE );
    }
    boolean isBSTUtil(Node root, int min, int max){
        if(node==null){
            return true;

        }
        if(node.data<min || node.data>max){
            return max;

        }
        return isBSTUtil(root.left, min, node.data-1) && isBSTUtil(root.right, node.data+1,max);
    }
}