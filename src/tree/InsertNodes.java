package tree;

public class InsertNodes {

    public BST.Node insert(BST.Node root, int value) {
        if(root==null)
            return root= new BST.Node(value);
        if(value<root.key){
            root.left =insert(root.left,value);
        }
        else
        {
            root.right =insert(root.right,value);
        }
        return root;
    }
    public BST.Node createTreeFromArray(int[] treeValues, BST.Node root) {

        for(int i=0;i<treeValues.length;i++){
            root=insert(root,treeValues[i]);
        }
        return root;
    }
}
