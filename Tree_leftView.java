class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
       ArrayList<Integer> arr = new  ArrayList<Integer>();
       if(root==null)
       return arr;
       leftView(root,arr,0);
        return arr;
    }
    void leftView(Node root,ArrayList<Integer> arr, int level ){
        if(root == null)
        return;
        
        if(level == arr.size())
        arr.add(root.data);
        leftView(root.left,arr,level+1);
        leftView(root.right,arr,level+1);    }
}
