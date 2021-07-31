package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreePracticeTest {
    TreePractice test = new TreePractice();

    @Test
    public void testCreateList(){
        BST.Node root=null;
        assertEquals(3, test.depth(root));
    }
}