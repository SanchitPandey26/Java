import java.util.Scanner;

public class String_Methods_Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the email id: ");
        String str = sc.nextLine();

        boolean a = str.matches(".*gmail.com");

        if (a) {
            System.out.println("The email id is on gmail.");
        }
        else{
            System.out.println("The email id is not on gmail.");
        }

        int i = str.indexOf("@");
        String s1 = str.substring(0,i);
        String s2 = str.substring(i+1);
        System.out.println("The user of the email id is " + s1 + ".");
        System.out.println("The domain name of the email id is " + s2 + ".");

    }
}
