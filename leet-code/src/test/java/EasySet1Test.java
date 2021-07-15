import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasySet1Test {

    EasySet1 set1= new EasySet1();
    @Test
    public void testSqrt(){
        assertEquals(46340,set1.mySqrt(2147395600));
    }
    @Test
    public void testMergeSortedArrays(){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        assertEquals(nums1,set1.merge(nums1,3,new int[]{2,5,6},3));
    }
}