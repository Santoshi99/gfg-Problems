public static boolean isPresent(Node root, int target, ArrayList<Integer> ans){
        
        //base case
        if(root == null){
            return false;
        }
        if(root.data == target){
            return true;
        }
        
        //recursive case
        if(isPresent(root.left,target,ans)){
            ans.add(root.data);
            return true;
        }
        if(isPresent(root.right,target,ans)){
            ans.add(root.data);
            return true;
        }
        //if not present in left subtree as well as right subtree
        return false;
    }
    
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList();
        isPresent(root,target,ans);
        return ans;
    }
}
