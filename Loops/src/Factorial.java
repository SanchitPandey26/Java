import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for finding factorial: ");
        int a = sc.nextInt();
        int b = 1;

        for (int i = 1; i <= a; i ++){
            b = b * i;
        }
        System.out.printf("The factorial of %d is %d" , a, b);
    }
}
