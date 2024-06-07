import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n < 2) System.out.println(-1);
        else {
            int max = arr[0], secondMax = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > max && arr[i] > secondMax) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax && arr[i] < max) {
                    secondMax = arr[i];
                }
            }

            if (secondMax == Integer.MIN_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(secondMax);
            }
        }
    }
}
