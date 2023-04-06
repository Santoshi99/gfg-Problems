class Solution
{
	int getLevelDiff(Node root)
	{
	    //code here
	    Queue<Node> q = new LinkedList<>();
	    int diff=0; 
	    ArrayList<Integer> oddarr = new ArrayList<Integer>();
	    ArrayList<Integer> evenarr = new ArrayList<Integer>();
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    if(root==null)
	    return 0;
	    
	    q.add(root);
	    q.add(null);
	    int height = 1;
	    oddarr.add(root.data);
	    while(!q.isEmpty()){
	      Node top =  q.remove();
	      
	      if(top==null)
	      {
	          height++;
	          if(height%2==0)
	           evenarr.addAll(arr);
	           else
	           oddarr.addAll(arr);
	          
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
	    int even=0,odd=0;
	    for(int i=0;i<evenarr.size();i++)
	    {
	        even+=evenarr.get(i);
	        //System.out.println(evenarr.get(i)+"l");
	    }
	    for(int i=0;i<oddarr.size();i++)
	    {
	        odd+=oddarr.get(i);
	        //System.out.println(oddarr.get(i));
	    }
	    return odd-even;
	}
}
