class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
       if(root==null)
       return true;
       return isSubTreeSym(root.left,root.right);
    }
    
    public static boolean isSubTreeSym(Node root1, Node root2){
        
        if(root1==null&& root2 == null)
        return true;
        if(root1==null||root2==null)
        return false;
        if(root1.data == root2.data){
            return isSubTreeSym(root1.left,root2.right)&&isSubTreeSym(root1.right,root2.left);
        }
        return false;
    }
}
