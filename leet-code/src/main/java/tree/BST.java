package tree;

import java.util.List;

public class BST {
    static class Node {
        int key;
        Node left, right;

        Node(int value) {
            key = value;
            left = right = null;
        }
    }

    static Node root;
    static Node root2;

    public static void main(String[] args) {
        BST bst = new BST();
        InsertNodes insert = new InsertNodes();
        PrintTree print = new PrintTree();
        MergeTrees merge = new MergeTrees();
        TreeOperations operations= new TreeOperations();
        int[] treeValues = {4,3,5,1,7};
        int[] tree2Values = {6, 3, 2, 1, 4, 8, 9};


        //insert
        root = insert.createTreeFromArray(treeValues, root);
        root2 = insert.createTreeFromArray(tree2Values, root2);
        List<Integer> list = print.inorderTraversal(root);
        for (Integer i:list) System.out.println(i);

        //print.inorder(root);
        //System.out.println("sum:"+operations.deepestLeavesSum(root));
        //print.printDFS(root2);

        //System.out.println("smallest=" + print.findSmallest(root).key);

        //print.printLeafNodes(root);
        //Node merged= merge.mergeTrees(root,root2);
        //System.out.println("depth="+operations.findDepthOfTheTree(merged));
//        System.out.println("depth="+operations.findDepthOfTheTree(root));
        //print.inorder(merged);

        //System.out.println("==>"+operations.isUnivaluated(root));
//        System.out.println("sum:"+operations.sumAllNodes(root));
//        print.printBFS(root);
//        print.printLeftSideOfTree(root);



    }





}
