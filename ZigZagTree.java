class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    Queue<Node> que = new LinkedList<>();
	    
	    if(root == null)
	    return arr;
	   
	    arr.add(root.data);
	    que.add(root);
	    que.add(null);
	    int level =1;
	    ArrayList<Integer> subarr = new ArrayList<Integer>();
	    while(!que.isEmpty()){
	       Node top = que.remove();
	       
	       if(top==null)
	       {
	           ++level;
	           if(level%2==0)
	           {
	              Collections.reverse(subarr);
	              arr.addAll(subarr);
	              subarr.clear();
	           }
	           else
	           {
	              arr.addAll(subarr);
	              subarr.clear();
	           }
	           if(!que.isEmpty())
	           que.add(null);
	           
	           //System.out.println(que.peek().data);
	       }
	       else
	       {
	       if(top.left!=null)
	       {
	           subarr.add(top.left.data);
	           que.add(top.left);
	       }
	       if(top.right!=null)
	       {
	           que.add(top.right);
	           subarr.add(top.right.data);
	       }
	       }
	        
	    }
	    return arr;
	}
}
