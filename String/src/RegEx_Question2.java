public class RegEx_Question2 {
    public static void main(String[] args) {
        //String str = "   a!B@c%1*2 3    ";
        String str1 = "     This    is   a  sentence     ";

        str1 = str1.replaceAll("\\s+"," ").trim();
        String words[] = str1.split("\\s");


        //System.out.println(str.replaceAll("\\W*",""));
        System.out.println(words.length);
    }
}
