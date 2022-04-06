import java.lang.*;
import java.util.*;

public class PrimeNumber1ToN {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int c = 0 ;
        for(int i=2;i<=no;i++){
            c = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    //System.out.print(i+" ");
                    c++;
                }
            }
            if(c==2){
                System.out.print(i+" ");
            }

        }
        if(c==0){
                System.out.print("There are no prime numbers less than or equal to "+no);
        }

    }

}
