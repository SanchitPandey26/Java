public class RegEx {
    public static void main(String[] args) {

        /*
        RegEx symbols for single characters

        String str1 = "m";
        String str2 = "ab";
        String str3 = "p";
        String str4 = "A";
        String str5 = "a7";
        String str6 = "S";
        String str7 = "abc";
        String str8 = "a";
        String str9 = "b";
        String str10 = "$";
        String str11 = " ";
        String str12 = " ";

        System.out.println(str1.matches(".")); // true for any character
        System.out.println(str2.matches("[abc]")); // true for out of abc
        System.out.println(str3.matches("[^abc]")); // true for except of abc
        System.out.println(str4.matches("[a-z0-9]")); // true for from the range
        System.out.println(str5.matches("[a-z][0-9]")); // true for two characters from the range
        System.out.println(str6.matches("A|B")); // true for A or B
        System.out.println(str7.matches("abc")); // true for two characters exactly abc
        System.out.println(str8.matches("\\w")); // true for number or digits
        System.out.println(str9.matches("\\d")); // true for digits
        System.out.println(str10.matches("\\D")); // true for all except digits
        System.out.println(str11.matches("\\s")); // true for space
        System.out.println(str12.matches("\\S")); // true for all except space
         */

        /*
        RegEx symbols for multiple characters

        String str1 = "abcdef";
        String str2 = "aaaabbcccba";
        String str3 = "acc";
        String str4 = "abbcacc";

        System.out.println(str1.matches(".*")); // true for 0 or more number of times
        System.out.println(str2.matches("[abc]+")); // true for 1 or more number of times
        System.out.println(str3.matches("[abc]{3}")); // true for 3 number of times
        System.out.println(str4.matches("[abc]{2,6}")); // true for 2 to 6 number of times
         */

        /*
        Application of RegEx

        String str1 = "john@gmail.com";

        System.out.println(str1.matches(".*gmail.*")); // checks if "gmail" is present in string
         */

    }
}
