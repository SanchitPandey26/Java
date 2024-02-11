import java.util.Scanner;

public class Sum_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number upto which sum is to be found: ");
        int n = sc.nextInt();
        int a = 0;

        for (int i = 1; i <=n; i++){
            a = a + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is " + a);
    }
}
