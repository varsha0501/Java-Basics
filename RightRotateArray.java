import java.lang.*;
import java.util.*;


public class RightRotateMatrixArray {
    public static void main(String[] args) {

        int A[] = {1,2,3,4,5} ;
        int B[] = {2,3};
        int temp[];
        int ans[][] = new int[B.length][A.length];
        int copiedArray[]  = Arrays.copyOf(A, A.length);
        for(int i=0;i<B.length;i++) {
            temp = rotate(A, B[i]);

            for (int k = 0; k < A.length; k++) {
                ans[i][k] = temp[k];
            }
            A = Arrays.copyOf(copiedArray,copiedArray.length) ;
            //System.out.println(ans.length);
        }
        printArr(ans); 

    }
    
    public static void printArr(int[][] arr){

            for(int i=0;i<arr.length;i++){
                for(int j=0; j<arr[i].length;j++) {
                    System.out.print(arr[i][j]+" ") ;
                }
                System.out.println();
            }

        }    

     public static int[] rotate(int[] arr, int Ktimes){
        // System.out.print("Ktimes---"+Ktimes) ;
        for(int i=1;i<=Ktimes;i++){
            int j = 0 ;
            int last = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1] ;
            }
            arr[j] = last;
        }
        return arr;
    }
}
