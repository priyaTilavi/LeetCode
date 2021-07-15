package array;

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
}
