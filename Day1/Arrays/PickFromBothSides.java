package Array;

public class PickFromBothSides {
    public static void main(String[] args) {

        int A[] = { 5, -2, 3 , 1, 2 } ;
        int B = 3 ;

        int n=A.length;
        int leftSum=0;
        // sum till B
        for(int i=0;i<B;i++)
            leftSum += A[i];

        int s2=leftSum;
        for(int i=n-1,j=B-1;j>=0;j--,i--)
        {
            leftSum += A[i];  // N-1
            leftSum -= A[j];  // B-1
            s2=Math.max(leftSum,s2);
        }

        System.out.println("s2......"+s2);


//
//        int sumLeft = 0 ;
//        int sumRight = 0;
//
//        for(int i=0;i<B;i++){
//            sumLeft+=A[i];
//        }
//
//        for(int j=A.length-B;j<A.length;j++){
//            sumRight+=A[j];
//        }
//
//        int sumBothSides = A[0];
//
//        for(int k=A.length-B+1;k<A.length;k++){
//            sumBothSides+=A[k];
//        }
//
//        System.out.println("sumRight: "+sumRight+"...");
//        System.out.println("sumLeft: "+sumLeft+"...");
//
//        int maxRound1 = Integer.MIN_VALUE ;
//        maxRound1 = Math.max(sumLeft,sumRight) ;
//        int maxRound2 = 0;
//        maxRound2 = Math.max(maxRound1,sumBothSides);
//
//        System.out.println("sumBothSides: "+sumBothSides+"...");
//        System.out.println(maxRound2);
    }
}
