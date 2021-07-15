import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromTest {

    LongestPalindrom solution = new LongestPalindrom();

    @Test
    public void test1(){
        String a="abcccd";
        int end= a.length()-1;
        assertEquals("a",solution.longestPalindrome("a"));
        assertEquals("",solution.longestPalindrome(""));
        assertEquals("a",solution.longestPalindrome("ab"));
        assertEquals("bab",solution.longestPalindrome("babad"));
        assertEquals("bb",solution.longestPalindrome("cbbd"));
        System.out.println(a.substring(1,end+1));



    }

}