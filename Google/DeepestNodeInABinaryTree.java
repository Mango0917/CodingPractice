/*
Input : Root of below tree
            1
          /   \
         2      3
        / \    / \ 
       4   5  6   7
                   \
                    8
Output : 8

Input : Root of below tree
            1
          /   \
         2      3
               / 
              6  
Output : 6
*/
class Solution{
    void find(Node root, int level, int maxLevel, int res)
    {
        if (root != null)
        {
            find(root.left, ++level, maxLevel, res);
    
            // Update level and resue
            if (level > maxLevel)
            {
                res = root.data;
                maxLevel = level;
            }
    
            find(root.right, level, maxLevel, res);
        }
    }
 
// Returns value of deepest node
    int deepestNode(Node root)
    {
        // Initialze result and max level
        int res = -1;
        int maxLevel = -1;
    
        // Updates value "res" and "maxLevel"
        // Note that res and maxLen are passed
        // by reference.
        find(root, 0, maxLevel, res);
        return res;
    }
}
