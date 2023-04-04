class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        
        mirrorTree(node);
        return;
    }
    
    Node mirrorTree(Node node){
        if(node == null)
        return null;
        Node left = mirrorTree(node.left);
        Node right = mirrorTree(node.right);
        node.left=right;
        node.right=left;
        return node;
    }
}


===============
void mirror(Node* root) {
        if(!root){
            return ;
        }
        if(!root->left and !root->right){
            return;
        }
        swap(root->left,root->right);
        mirror(root->left);
        mirror(root->right);
        
    }
