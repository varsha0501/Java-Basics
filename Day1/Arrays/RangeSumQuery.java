package Array;

public class RangeSumQuery {

    public static int[] cumArray(int A[]){

        int cumArr[] = new int[A.length];
        cumArr[0] = A[0];
        for(int i=1; i<A.length; i++){
            cumArr[i] = cumArr[i-1] + A[i];
        }
        return  cumArr ;
    }

    public static void rangeSum(int[] A, int[][]B){

        int leftStart = 0 ;
        int rightStart = 0 ;
        int rangeSum = 0 ;
        for(int i=0;i<B.length;i++) {
            leftStart = B[i][0] ;
            rightStart =  B[i][1] ;
            System.out.println(B[i][0] +"---" + B[i][1] );
            int[] res = cumArray(A);

            for(int cum=0;cum<A.length;cum++){
                System.out.print(A[cum]+"--");
            }
            System.out.println();
            for(int cum=0;cum<res.length;cum++){
                System.out.print(res[cum]+"--");

            }
            if (B[i][0]==1)
                rangeSum =  res[rightStart-1] ;
            else
                rangeSum = res[rightStart-1] - res[leftStart-2] ;
            System.out.println();
            System.out.println(rangeSum+"......");
        }

    }

    public static void main(String[] args) {

        int A[] = { 6, 3, 3, 3, 1, 8, 10, 5, 3} ;
        int B[][] = { {2, 9},{3, 6},{5, 7},{5, 9},{7, 9},{6, 9},{2, 3},{1, 8},{4, 7} } ;

        //int A[] = {1,2,3,4,5} ;
        //int B[][] ={ {1, 4}, {2, 3} };

        rangeSum(A,B);

    }

}
