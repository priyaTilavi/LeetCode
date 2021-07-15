package tree;

public class MergeTrees {

    public BST.Node mergeTrees(BST.Node root1 , BST.Node root2) {

        if(root1==null && root2==null) return null;

        int key = (root1==null?0:root1.key)+ (root2==null?0:root2.key);
        BST.Node newTree = new BST.Node(key);

        newTree.left= mergeTrees(root1==null?null:root1.left,root2==null?null:root2.left);
        newTree.right= mergeTrees(root1==null?null:root1.right,root2==null?null:root2.right);

        return newTree;
    }
//    Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
    public int rangeSumBST(BST.Node root, int L, int R) {
        int result = dfs(root,L, R, 0);
        return result;
    }

    public int dfs(BST.Node root, int L, int R, int result){
        if(root.key >= L && root.key<= R){
            result += root.key;
        }
        if(root.key>L){
            result = dfs(root.left, L, R, result);
        }
        if(root.key<R){
           result= dfs(root.right, L, R, result);
        }
        return result;
    }

}
