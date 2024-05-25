import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (char j = (char) ('A'+n-1); j >= 'A'+n-1-i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
