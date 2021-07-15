import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumProblemSet1Test {
    MediumProblemSet1 set1 = new MediumProblemSet1();

    @Test
    public void intToRoman(){
//        assertEquals("V", set1.intToRoman(5));
    }

    @Test
    public void testSudokuValidation (){
       char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        boolean validSudoku = set1.isValidSudoku(board);
        assertEquals(true,validSudoku);
        System.out.println(board[0][0]);
    }

    @Test
    public void testRomanToInt(){
        assertEquals(3,set1.romanToInt("III"));
        assertEquals(58,set1.romanToInt("LVIII"));
        assertEquals(4,set1.romanToInt("IV"));
    }
    @Test
    public void removeDuplicate(){
        assertEquals(2,set1.removeElement(new int[]{3, 2, 2, 3},3));
        assertEquals(5,set1.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        assertEquals(2,set1.removeElement(new int[]{3, 2, 2, 3},3));

    }



}