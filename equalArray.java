public class equalArray {


        public static int solve(int[] A) {

            int N = A.length;
            int pfEven[] = new int[N];

            pfEven[0] = A[0];

            for (int i=1; i<N; i++) {

                if (i%2==0) {
                    pfEven[i] = pfEven[i-1]+A[i];
                }else {
                    pfEven[i] = pfEven[i-1];
                }

            }

            int[] pfOdd = new int[N];
            pfOdd[0] = 0;
            for (int i=1; i<N; i++) {
                if(i%2==0) {
                    pfOdd[i] = pfOdd[i-1];
                } else {
                    pfOdd[i] = pfOdd[i-1] + A[i];
                }
            }

            int count = 0;
            for (int i=0; i<N; i++) {
                int sumEven = 0;
                if (i==0) {
                    sumEven = pfOdd[N-1];
                } else {
                    sumEven = pfEven[i-1] + (pfOdd[N-1] - pfOdd[i]);
                }
                int sumOdd = 0;
                if (i==0) {
                    sumOdd = pfEven[N-1];
                } else {
                    sumOdd = pfOdd[i-1] + (pfEven[N-1] - pfEven[i]);
                }
                if (sumEven == sumOdd) {
                    count++;
                }
            }
            return count;

    }

        public static void main(String[] args) {

            int arr[] = {2, 1, 6, 4};

            int res = solve(arr);

            System.out.println("cnt----"+res);
        }

}
