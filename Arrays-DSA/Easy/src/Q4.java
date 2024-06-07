import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1) System.out.println(true);
        else {
            int count = 0;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i+1]) count++;
            }
            if (arr[0] < arr[n-1]) count++;
            System.out.println(count <= 1);
        }
    }
}
