class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
        //code here
         Queue<Node> q = new LinkedList<>();
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    ArrayList<Integer> largest = new ArrayList<Integer>();
	    if(root==null)
	    return largest;
	    
	    q.add(root);
	    q.add(null);
	    
	    largest.add(root.data);
	    while(!q.isEmpty()){
	      Node top =  q.remove();
	      
	      if(top==null)
	      {
           int temp =0;
	         for(int i=0;i<arr.size();i++)
	          {
	              if(arr.get(i)>temp)
	              temp = arr.get(i);
	          }
	          if(temp!=0)
	              largest.add(temp);
	           if(!q.isEmpty())
             q.add(null);
	           arr.clear();
	      }
	      else{ if(top.left!=null)
	      {
	      q.add(top.left);
	      arr.add(top.left.data);
	      }
	      if(top.right!=null)
	      {
	      q.add(top.right);
	      arr.add(top.right.data);
	      }
	      }
	    }
	    
	    return largest;
    }
}
