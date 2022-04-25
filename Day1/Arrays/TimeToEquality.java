package Array;

public class TimeToEquality {

    public static void main(String[] args) {

        int  A[] = {2, 4, 1, 3, 2};

        int max = Integer.MIN_VALUE;
        int count = 0;
        int fulfillArray = 0 ;
        for(int i=0;i<A.length;i++){
            max = Math.max(A[i],max) ;

        }
        for(int i=0;i<A.length;i++) {
            fulfillArray = A[i] ;
            while (fulfillArray != max) {
                count++;
                fulfillArray++;
            }
        }
//        int ans=0;
//        for(int i=0;i<n;i++)
//        {
//            ans+=val-A[i];
//        }
        System.out.println(max);
        System.out.println(count);

    }
}
