public class MaxEven_MinOdd {

    public static void main(String[] args) {

        int A[] = {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85} ;
        int max= 0 ;
        int min = 0;

        for(int i=0;i<A.length;i++){

           // System.out.print(A[i]+ " ");

            if( A[i] != 0 && A[i]%2== 0 && A[i] > max  ){
                max = A[i] ;
            }
            else {
                min = A[i];
            }
        }
        System.out.println(max + " " + min);

    }

}
