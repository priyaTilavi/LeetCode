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
    public int deepestLeavesSum(BST.Node root) {

        int level= findDepthOfTheTree(root);
        System.out.println("level:"+level);
        return findSum(root, level);

    }

    public int findSum(BST.Node root, int level){
        if (root==null) return 0;
        if(level== 1) {
            return root.key;
        }
        return findSum(root.left,level-1) + findSum(root.right,level-1);
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
    public int sumAllNodes(BST.Node root){
        if(root==null){
            return 0;
        }
        else {
            return root.key + sumAllNodes(root.left)+ sumAllNodes(root.right);
        }
    }
    public boolean isSameTree(BST.Node p, BST.Node q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null || p!=null && q==null) return false;
        if(p.key!=q.key) return false;
        else
        {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) && true;
        }
    }
    public BST.Node invertTree(BST.Node root) {
        if(root==null) return null;

        BST.Node temp= invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;

    }
    public int sumOfLeftLeaves(BST.Node root){
        return sum(root,false);
    }

    private int sum(BST.Node root, boolean isLeft) {
        if(root==null) return 0;
        if(isLeft && root.left==null && root.right==null){
            return root.key;
        }
        return sum(root.left,true)+ sum(root.right,false);
    }

    public boolean hasPathSum(BST.Node root, int targetSum) {
        int totalSum=0;
       return hasPath(root,targetSum,totalSum);
    }

    private boolean hasPath(BST.Node root, int targetSum, int totalSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null&& totalSum+root.key==targetSum) return true;
        int sum = totalSum + root.key;
        return hasPath(root.left,targetSum,sum) || hasPath(root.right,targetSum,sum);
    }

    public int addNode(BST.Node node){
        if(node ==null) return 0;
        return addNode(node.left)+ addNode(node.right)+ 1;
    }

}
