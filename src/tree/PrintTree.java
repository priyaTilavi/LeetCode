package tree;

public class PrintTree {


    public BST.Node printLeafNodes(BST.Node root) {
        if(root ==null) return root;

        if(root.left==null && root.right== null) {
            System.out.println("leaf"+root.key);
            return root;
        }

        if(root.left!=null && root.right!= null) {
            root.right = printLeafNodes(root.right);
            root.left = printLeafNodes(root.left);

        }
        else{
            if(root.left==null) {
                root.right = printLeafNodes(root.right);
            }
            else {
                root.left = printLeafNodes(root.left) ;
            }
        }
        return root;
    }


    public void inorder(BST.Node root){
        if(root!=null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
        return;
    }

    public BST.Node findSmallest(BST.Node root) {
        if (root == null) return root;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
