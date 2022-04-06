import  java.util.*;

public class WordReverse {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int inputTimes  = sc.nextInt();
        for(int i=0;i<inputTimes;i++) {
            String s = sc.next(); // nextLine() won't wok as need to put cursor next line
            String rev = "";
            for (int j = s.length(); j > 0; j--) {
                rev = rev + s.charAt(j - 1);
            }
            System.out.println(rev);
        }
    }

}
