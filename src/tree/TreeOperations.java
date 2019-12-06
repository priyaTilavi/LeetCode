package tree;

public class TreeOperations {

    public boolean isUnivaluated(BST.Node root){
        if(root==null) return true;

        int temp= root.key;
        return checkUnivaluated(root,temp);

    }
    private boolean checkUnivaluated(BST.Node root, int temp) {
        boolean result=true;

        if(root==null) return true;
        if(root.key!=temp) return false;

        if(root!=null && root.key==temp)
        {
             result=(checkUnivaluated(root.left,temp) && true) && (checkUnivaluated(root.left,temp) && true) ;
        }
        return result;
    }

    public int findDepthOfTheTree(BST.Node root){
        if(root==null) return 0;

        int leftDepth = findDepthOfTheTree(root.left);
        int rightDepth = findDepthOfTheTree(root.right);

        if(leftDepth>rightDepth)
            return leftDepth+1;
        else
            return rightDepth+1;

    }

//    public BST.Node searchNode(BST.Node root, int val){
//        if (root==null) return null;
//
//        if(root.key==val){
//            return root;
//        }
//        else{
//            root.left=searchNode((root.left==null?null:root.left),val);
//            root.right=searchNode((root.right==null?null:root.right),val);
//        }
//        return
//    }

}
