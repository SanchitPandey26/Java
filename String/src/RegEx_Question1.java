public class RegEx_Question1 {
    public static void main(String[] args) {
        int a;
        String str1, b, c;

        a = 1010011;
        b = "127ABF";
        c = "12/12/2012";

        str1 = String.valueOf(a);

        System.out.println(str1.matches("[01]+"));
        System.out.println(b.matches("[0-9 A-F]+"));
        System.out.println(c.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
