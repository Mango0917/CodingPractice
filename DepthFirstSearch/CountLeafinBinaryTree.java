/*
Program to count leaf nodes in a binary tree
1.6
A node is a leaf node if both left and right child nodes of it are NULL.

*/

int getLeafCount(Node node) 
{
    if (node == null)
        return 0;
    if (node.left == null && node.right == null)
        return 1;
    else
        return getLeafCount(node.left) + getLeafCount(node.right);
}