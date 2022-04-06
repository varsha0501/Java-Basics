public class StringDemo {

    public static void main(String args[]) {
        String test = "I am preparing for MICROSOFT" ;
        //String orgStr = sc.nextLine();
        String words[] = test.split("\\s"); // it will seperate words from string and insert in  array
        String reversedString = "";

        for(int i=0;i < words.length; i++){
            String wordStr = words[i];
            //System.out.println(wordStr);
            String revWords = "";
            for(int j=wordStr.length();j>0;j--){
                revWords =  revWords + wordStr.charAt(j-1) ;
                //System.out.println(revWords); --> T . TF . TFO . TFOS ..... TFOSORCIM
            }
            reversedString = reversedString + revWords + " " ;
        }

        System.out.println(reversedString);

    }

}
