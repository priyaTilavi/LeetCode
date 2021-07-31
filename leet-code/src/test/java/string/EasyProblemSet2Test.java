package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyProblemSet2Test {

    EasyProblemSet2 problemSet = new EasyProblemSet2();

    @Test
    public void testIsIsomorphic(){
        assertEquals(true,problemSet.isIsomorphic("egg","add"));
        assertEquals(true,problemSet.isIsomorphic("paper","title"));
    }
    @Test
    public void testReverseOnlyLetters(){
        assertEquals("dc-ba",problemSet.reverseOnlyLetters("ab-cd"));
        assertEquals("j-Ih-gfE-dCba",problemSet.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("Qedo1ct-eeLg=ntse-T!",problemSet.reverseOnlyLetters("Test1ng-Leet=code-Q!"));

    }
}