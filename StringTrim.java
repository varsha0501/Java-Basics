public class StringTrim {

    public static void main(String[] args) {

        String A = "****";

        int start = 0;
        int end = A.length();

        System.out.println(A.charAt(start));
        while(start != end && A.charAt(start) == '*' && start < end ) {
            start++;
        }

        if(start == end)
            System.out.println("");

        System.out.println(start);
        System.out.println(end);

        while(A.charAt(end-1) == '*' && end >= start )
            end--;

        System.out.println( A.substring(start,end));

    }

}
