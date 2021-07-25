import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    Recursion solution = new Recursion();
    @Test
    void testFibonacci() {
        assertEquals(1,solution.fibbonacci(2));
        assertEquals(2,solution.fibbonacci(3));
    }

    @Test
    void testIfArraySorted() {
        assertEquals(true,solution.check(new int[]{1,2,3,4,5}));
        assertEquals(false,solution.check(new int[]{1,4,3,5,5}));

    }
}