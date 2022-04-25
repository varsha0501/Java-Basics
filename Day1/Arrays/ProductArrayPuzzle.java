package Array;

public class ProductArrayPuzzle {

    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4, 5};

        //120, 60, 40, 30, 24

        int prod[] = new int[A.length] ;
        int left[] = new int[A.length] ;
        int right[] = new int[A.length] ;

        left[0] = 1;
        right[A.length - 1] = 1;
//
//        for(int i=1;i<A.length;i++){
//            left[i] = A[i-1] * left[i-1] ;
//        }
//
//        for (int j = A.length - 2; j >= 0; j--)
//            right[j] = A[j + 1] * right[j + 1];
//
//        for (int i = 0; i < A.length; i++)
//            prod[i] = left[i] * right[i];
//
//        for(int i=0;i<A.length;i++){
//            System.out.print(prod[i]+"....");
//        }


        // alternative approach - Scale Solution

        int product = 1;
        int n = A.length;

        for(int i = 0; i < A.length; i++)
        {
            product *= A[i];
        }

        int []ans = new int[n];

        for(int i = 0; i < A.length; i++)
            ans[i] = product/A[i];

        for(int i=0;i<A.length;i++){
            System.out.print(ans[i]+"....");
        }

    }
}
