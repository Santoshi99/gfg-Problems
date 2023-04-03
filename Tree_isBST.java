public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
     {return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);}
     
    boolean isBST(Node root, int min, int max)
    {
        // code here.
        if(root ==null)
        return true;
        if(root.data<max&&root.data>min)
        return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
        
        return false;
    
    }
}
