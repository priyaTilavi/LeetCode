import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {
    StringToInteger solution = new StringToInteger();
    @Test
    public void test1(){

        assertEquals(42,solution.myAtoi("42"));
        assertEquals(-42,solution.myAtoi("   -42"));

        assertEquals(4193,solution.myAtoi("4193 with words"));
        assertEquals(0,solution.myAtoi("words and 987"));

        assertEquals(-2147483648,solution.myAtoi("-91283472332"));
        assertEquals(-12,solution.myAtoi("  -0012a42"));
        assertEquals(2147483647,solution.myAtoi("2147483648"));
        assertEquals(2147483647,solution.myAtoi("9223372036854775808"));
    }
}