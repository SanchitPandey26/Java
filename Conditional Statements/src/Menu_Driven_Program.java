import java.util.Scanner;

public class Menu_Driven_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***MENU***");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.print("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Option: ");
        String c = sc.nextLine();

        switch (c){
            case "Add":
                System.out.println(a + b);
                break;
            case "Subtract":
                System.out.println(a - b);
                break;
            case "Divide":
                System.out.println((float) a / b);
                break;
            case "Multiply":
                System.out.println(a * b);
                break;
            case "Exit":
                System.out.println("Exited from the program.");
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
