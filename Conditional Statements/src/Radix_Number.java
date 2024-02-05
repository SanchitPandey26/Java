import java.util.Scanner;

public class Radix_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String num = sc.nextLine();

        if (num.matches("[01]+")){
            System.out.println("The type of number is Binary. Radix = 2");
        }
        else if (num.matches("[0-7]+")) {
            System.out.println("The type of number is Octal. Radix = 8");
        }
        else if (num.matches("[0-9]+")) {
            System.out.println("The type of number is Decimal. Radix = 10");
        }
        else if (num.matches("[0-9 A-F]+")) {
            System.out.println("The type of number is Hexadecimal. Radix = 16");
        }
        else{
            System.out.println("The number is invalid.");
        }
    }
}
