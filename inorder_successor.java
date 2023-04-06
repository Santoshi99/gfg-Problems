*/
class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    boolean flag = false;
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          if(root==null)
          return null;
          
          Node left = inorderSuccessor(root.left,x);
          if(flag){
             flag =false;
              return root;
          }
          if(x.data==root.data)
          flag = true;
          Node right = inorderSuccessor(root.right,x);
          if(left==null) return right;
          if(right==null) return left;
          return null;
         }

}
