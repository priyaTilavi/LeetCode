import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    Recursion solution = new Recursion();
    @Test
    void testFibonacci() {
        assertEquals(1,solution.fibbonacci(2));
        assertEquals(2,solution.fibbonacci(3));
    }
}