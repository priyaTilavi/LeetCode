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

}