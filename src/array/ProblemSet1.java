package array;

public class ProblemSet1 {

    public static void main(String[] args) {

        int[][] A= {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(A);
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
}
