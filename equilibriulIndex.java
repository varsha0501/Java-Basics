public class equilibriulIndex {

        public static int sumArr(int start, int end, int A[]){

            int sum = 0 ;
            for(int i=start; i<=end; i++){
                sum = sum + A[i];
            }
            return sum ;
        }

        public static int solve(int[] A) {

            int N = A.length ;
            int cnt = 0;
            int beforeSum = 0;
            int afterSum = 0, sum = 0;

            for(int i=0; i<A.length; i++){
                beforeSum  = sumArr(0, i-1, A) ;
                afterSum =  sumArr(i+1, N-1, A) ;
                System.out.println("beforeSum---"+beforeSum);
                System.out.println("afterSum---"+afterSum);
                if(beforeSum == afterSum){
                    return i;
                }
            }
            return -1;

        }

        public static void main(String[] args) {

            int arr[] = {-7, 1, 5, 2, -4, 3, 0};
            int res =  solve(arr);
            System.out.println(res);

        }


}
