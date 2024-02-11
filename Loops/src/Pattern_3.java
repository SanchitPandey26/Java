import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= (2*n-1); i++){
            for (int j = 1; j <= n; j++){
                if (j <= (n-i)) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            for (int k = 1; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
