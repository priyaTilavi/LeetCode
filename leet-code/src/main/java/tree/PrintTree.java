package tree;

import java.util.ArrayList;
import java.util.List;

public class PrintTree {


    public void printLeafNodes(BST.Node root) {
        if(root ==null) return;

        if(root.left==null && root.right== null) {
            System.out.println("leaf"+root.key);
//            return root;
        }

        if(root.left!=null && root.right!= null) {
            printLeafNodes(root.right);
            printLeafNodes(root.left);

        }
        else{
            if(root.left==null) {
                printLeafNodes(root.right);
            }
            else {
                printLeafNodes(root.left) ;
            }
        }
//        return root;
    }


    public void inorder(BST.Node root){
        if(root!=null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
        return;
    }
    public List<Integer> inorderTraversal(BST.Node root) {
        List<Integer> list= new ArrayList<Integer>();
        return traversal(root,list);

    }
    public List<Integer> traversal(BST.Node root, List list) {
        if(root!=null){
            traversal( root.left,list);
            list.add(root.key);
            traversal( root.right,list);
        }
        return list;
    }


    public BST.Node findSmallest(BST.Node root) {
        if (root == null) return root;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    //pre order
    public void printDFS(BST.Node root){
        if(root!=null){
            System.out.println(root.key);
            printDFS(root.left);
            printDFS(root.right);
        }
        return;
    }

    public void printBFS(BST.Node root){
        TreeOperations operations= new TreeOperations();
       int height = operations.findDepthOfTheTree(root);
       for(int i=1;i<=height;i++) bfs(root,i);
    }

    public void bfs(BST.Node root, int level){
        if(root== null) return;
        if(level==1) System.out.println(root.key);
        if(level>1) {
           bfs(root.left,level-1);
           bfs(root.right,level-1);
        }
    }

    public void printLeftSideOfTree(BST.Node root){
        if(root==null) return;
        while(root!=null){
            System.out.println(root.key);
            root = root.left;
        }

    }
}
