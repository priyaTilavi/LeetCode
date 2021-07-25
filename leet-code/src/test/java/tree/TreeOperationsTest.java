package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeOperationsTest {

    TreeOperations treeOperations = new TreeOperations();

    @Test
    public void isSame(){
        BST.Node tree1= new BST.Node(1);
        tree1.left = new BST.Node(2);
        BST.Node tree2= new BST.Node(1);
        tree1.right = new BST.Node(2);
        assertEquals(false,treeOperations.isSameTree(tree1,tree2));
    }

}