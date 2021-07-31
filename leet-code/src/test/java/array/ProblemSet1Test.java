package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemSet1Test {
    ProblemSet1 arrayProblems = new ProblemSet1();

    @Test
    public void searchInsertPosition(){
       assertEquals(4,arrayProblems.searchInsert(new int[]{1,3,5,6},7));
    }
    @Test
    public void maxProfit(){
        assertEquals(5,arrayProblems.maxProfit2(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void printDiagonal(){
        //[1 2 3]
        //[5 6 7]
        //[8 9 10]
        int[][] nums= new int[][]{{1,2,3},{5,6,7},{8,9,10}};
        arrayProblems.printDiagonal(nums);
    }
}