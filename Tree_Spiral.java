class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        if(root == null)
        return arr;
        Stack<Integer> s = new Stack<>();
        q.add(root);
        q.add(null);
        arr.add(root.data);
        
        int level = 0;
        
        while(!q.isEmpty()){
            Node top = q.remove();
            
            if(top == null){
                level++;
                while(!s.empty()){
                    arr.add(s.pop());
                }
                if(!q.isEmpty())
                q.add(null);
            }
            else{
                
                if(top.left!=null)
                {
                    q.add(top.left);
                    if(level%2==0)
                    arr.add(top.left.data);
                    else
                    s.push(top.left.data);
                }
                if(top.right!=null)
                {
                    q.add(top.right);
                    if(level%2==0)
                    arr.add(top.right.data);
                    else
                    s.push(top.right.data);
                }
            }
        }
        return arr;
    }
}
