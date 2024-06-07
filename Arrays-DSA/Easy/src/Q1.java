import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if (n==1) System.out.println(arr[0]);
        else {
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
}
