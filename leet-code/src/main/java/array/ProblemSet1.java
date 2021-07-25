package array;

import java.util.Arrays;

public class ProblemSet1 {

    public static void main(String[] args) {

        int[][] A= {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(A);
        int[] b={1,3,2,2,4,5,2};
        removeElement(b,2);
    }
    public static int[][] flipAndInvertImage(int[][] A) {
        int column= A[0].length;
        for(int i=0;i<A.length;i++){
            int temp= A[i][0];
            for(int k=1;k<column-1;k++){
                 A[i][k-1]= A[i][k];
                A[i][k-1] ^=1;
            }
            A[i][column-1] = temp;
            A[i][column-1] ^=1;
        }

        return A;
    }

    public static int removeElement(int[] nums, int val) {
        int w= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[w]= nums[i];
                w++;
            }
        }

        return w;
    }
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
            if(target>=nums[i]){}
            else{
                return i;
            }
        }
        return nums.length;
    }
    //121. Best Time to Buy and Sell Stock
    /*  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    */
    public int maxProfit(int[] prices) {
        int max=0;
        for( int index=0;index<prices.length;index++){
            int pointer= index;
            while(pointer<prices.length-1&&prices[pointer]>prices[pointer+1]) pointer++;
            index = pointer;
            for (;pointer<prices.length-1; pointer++){
               max= Math.max(max,prices[pointer+1]-prices[index]) ;
            }
        }
        return max;
    }
    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int globalMax = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int num : prices) {
            if (num <= min) {
                min = num;
            } else if (num > min) {
                max = num;
                globalMax = Math.max(globalMax, max - min);
            }
        }
        return globalMax == Integer.MIN_VALUE ? 0 : globalMax;

    }
}
