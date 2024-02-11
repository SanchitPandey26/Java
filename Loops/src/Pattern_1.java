import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(), count = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println();
        }
    }
}
