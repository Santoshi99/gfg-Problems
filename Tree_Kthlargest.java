class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    ArrayList<Integer> list = new ArrayList<>();
    public int kthLargest(Node root,int K)
    {
        //Your code here
        if(root==null)
        return 0;
        checklargest(root);
        return list.get(list.size()-K);
    }
    void checklargest(Node root){
       if(root == null)
       return;
       checklargest(root.left);
       list.add(root.data);
       checklargest(root.right);
    }
}
