import java.sql.Array;

public class EquilibriumIndexArray {


    public static int[] cumArray(int A[]){

        int cumArr[] = new int[A.length];
        cumArr[0] = A[0];
        for(int i=1; i<A.length; i++){
            cumArr[i] = cumArr[i-1] + A[i];
        }
        return  cumArr ;
    }

    public static void countEquilibriumIndex(int[] cum,int[] A){
        int count = 0 ;
        int N= cum.length;
        int beforeSum = 0;
        int afterSum = 0;

        //cum[0,i-1];
        //cum[i+1,N-1]

        for(int i=0;i<N;i++) {
            if (i==0)
                beforeSum = 0 ;
            else
                beforeSum = cum[i-1];

            //beforeSum = cum[i] - A[i];
            afterSum  = cum[N-1] - cum[i];
            System.out.println("beforeSum......"+beforeSum);
            System.out.println();
            System.out.println("afterSum......"+afterSum);
            if(beforeSum == afterSum){
                System.out.println("i---"+i);
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ") ;
        }
    }

    public static void main(String[] args) {

            //int A[] = {-3,2,4,-1};
            int A[] = {-7,1,5,2,-4,3,0};
            int[] cum = new int[A.length];
            cum = cumArray(A);
            printArr(cum);
            System.out.println();
            countEquilibriumIndex(cum,A);

    }
}
