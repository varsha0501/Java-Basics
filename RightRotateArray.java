import java.lang.*;
import java.util.*;


public class RightRotateArray {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[] = new int[N] ;

            int j ;
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            for(int i=0;i<k;i++){
                rotate(arr);
            }

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ") ;
            }

    }

    public static void rotate(int arr[]){
        // System.out.print("rotate called---") ;
        int j = 0 ;
        int last = arr[arr.length-1];
        for(j=0;j<arr.length-1;j++){
            arr[j+1] = arr[j] ;
        }
        arr[0] = last;


    }
}
