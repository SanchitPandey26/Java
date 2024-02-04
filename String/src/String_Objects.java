public class String_Objects {
    public static void main(String[] args) {
        String str1 = "Java Programming"; // Literal stored in pool

        String str2 = new String("JAVA"); // Object created in heap and literal stored in pool

        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);

        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b);

        System.out.println(str4);

    }
}
