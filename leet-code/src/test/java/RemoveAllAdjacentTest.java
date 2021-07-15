import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentTest {
    RemoveAllAdjacent solution = new RemoveAllAdjacent();
    @Test
    public void testRemove(){
        assertEquals("abcd",solution.removeDuplicates("abcd",2));
        assertEquals("aa",solution.removeDuplicates("deeedbbcccbdaa",3));
        assertEquals("ps",solution.removeDuplicates("pbbcggttciiippooaais",2));
    }
}