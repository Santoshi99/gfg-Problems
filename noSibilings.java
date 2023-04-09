class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
       ArrayList<Integer> arr =  noSiblingfunc(node);
       if(arr.size()!=0)
       {
           Collections.sort(arr);
           return arr;
       }
       else
       {
           arr.add(-1);
           return arr;
       }
    }
    ArrayList<Integer> noSiblingfunc(Node node)
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(node == null)
        {
            return arr;
        }
       if(node.left==null&& node.right!=null)
         arr.add(node.right.data);
        else if(node.left!=null&& node.right==null)
          arr.add(node.left.data);
        ArrayList<Integer> left = noSiblingfunc(node.left);
        ArrayList<Integer> right = noSiblingfunc(node.right);
        if(left!=null)
        arr.addAll(left);
        
        if(right!=null)
        arr.addAll(right);
        
        return arr;
        
    }
}
