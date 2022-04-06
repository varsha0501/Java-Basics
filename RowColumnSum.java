import java.util.Scanner;

public class RowColumnSum {

    public static void rowColSum(int rows, int cols, int rowSum, int colSum, int[][] A){

        for(int i=0;i<rows;i++){
            colSum = 0;
            for(int j=0;j<cols;j++){
                rowSum += A[i][j] ;
                colSum += A[j][i] ;
                // System.out.print(A[i][j]+" ");
            }
            System.out.println("sum of"+(i+1)+" col :"+colSum);
        }
    }


    public static void main(String[] args) {

        int rows , cols ;
        Scanner sc = new Scanner(System.in);
        rows = 3 ; // sc.nextInt();
       cols = 3 ; //sc.nextInt();
        int[][] A = { {1,2},{4,5},{7,8} } ; //new int[rows][cols];
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                A[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
        System.out.println("Print Array---");
        int rowSum = 0;
        int colSum = 0;
        for(int i=0;i<rows;i++){
            colSum = 0;
            for(int j=0;j<cols;j++){
                rowSum += A[i][j] ;
                colSum += A[j][i] ;
               // System.out.print(A[i][j]+" ");
            }
            System.out.println("sum of"+(i+1)+" row :"+rowSum);
        }

        int[][] transpose = new int[A.length][A[0].length];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[i][j] =  A[j][i] ;
                System.out.print(A[i][j]) ;
            }
            System.out.println();
        }

        System.out.println("Transpose===");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[i][j]) ;
            }
            System.out.println();
        }


    }
}
