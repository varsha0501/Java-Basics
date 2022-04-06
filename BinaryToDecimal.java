import java.lang.*;
import java.util.*;

public class BinaryToDecimal {

        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            double A = sc.nextLong();
            double rem = 0;
            int p = 0 ;
            double sum = 0 ;
            while(A>0){
                rem = A % 10  ;
                sum = sum + rem * Math.pow(2 , p) ;
                p++;
                A=A/10;
            }
            System.out.println(sum);
    }

}
