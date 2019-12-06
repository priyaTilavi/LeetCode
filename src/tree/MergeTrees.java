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

}
