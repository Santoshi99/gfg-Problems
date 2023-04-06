class Solution
{
    int i =0;
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        int[] bsTarr = new int[nums.length];
      helper(bsTarr,0,nums.length-1,nums);
      return bsTarr;
    }
    
    public void helper(int[] bsTarr, int left, int right, int[] nums){
        if(left>right)return;
        int mid =(left+right)/2;
        bsTarr[i++]=nums[mid];
        helper(bsTarr,left,mid-1,nums);
        helper(bsTarr,mid+1,right,nums);
        
    }
}
===================


class Node {
 
    int data;
    Node left, right;
 
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
class BinaryTree {
 
    static Node root;
 
    /* A function that constructs Balanced Binary Search
     Tree from a sorted array */
    Node sortedArrayToBST(int arr[], int start, int end)
    {
 
        /* Base Case */
        if (start > end) {
            return null;
        }
 
        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
 
        /* Recursively construct the left subtree and make
         it left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);
 
        /* Recursively construct the right subtree and make
         it right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);
 
        return node;
    }
 
    /* A utility function to print preorder traversal of BST
     */
    void preOrder(Node node)
    {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
 
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println(
            "Preorder traversal of constructed BST");
        tree.preOrder(root);
    }
}
