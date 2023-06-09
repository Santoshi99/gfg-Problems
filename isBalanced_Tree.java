class BalancedTree{
        int height;
        boolean isbal;
        BalancedTree(int height, boolean isbal){
            this.height = height;
            this.isbal = isbal;
        }
    }
    
class Tree
{
    
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	 // Your code here
	   BalancedTree bt = isBalHeight(root);   
	   return bt.isbal;
    }
    BalancedTree isBalHeight(Node root){
        BalancedTree isBHt = new BalancedTree(0,true);
        if(root ==null)
        {
            return isBHt;
        }
        BalancedTree leftBHT  = isBalHeight(root.left);
        BalancedTree rightBHT = isBalHeight(root.right);
        isBHt.height = 1+ Math.max(leftBHT.height,rightBHT.height);
        if(leftBHT.isbal==false||rightBHT.isbal ==false)
         isBHt.isbal =false;
         else
         {
             if(leftBHT.height-rightBHT.height==0||leftBHT.height-rightBHT.height==1||leftBHT.height-rightBHT.height==-1)
             isBHt.isbal = true;
             else
             isBHt.isbal = false;
         }
         return isBHt;
    }
    
}
===============

int Balanced(Node*root){
        if(root==NULL){
            return false;
        }
        int lh=Balanced(root->left);
            if(lh==-1) {return-1;
        }
        int rh=Balanced(root->right);
            if(rh==-1) {return -1;
        }
        if(abs(lh-rh)>1)return -1;
        else
        return max(lh,rh)+1;
    }
    bool isBalanced(Node *root)
    {
        //  Your Code here
        if(Balanced(root)==-1)
        return false;
        else 
        return true;
    }
