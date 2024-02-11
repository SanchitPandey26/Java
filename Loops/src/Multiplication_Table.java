import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Enter the number for display of multiplication table: ");
        a = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            b = a * i;
            System.out.println(a + " x " + i + " = " + b);
        }
    }
}
