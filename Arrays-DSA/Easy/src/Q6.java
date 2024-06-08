import java.util.Scanner;

public class Q6 {
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),k;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt();
        Reverse(arr, n - k, n-1);
        Reverse(arr, 0, n-k-1);
        Reverse(arr, 0, n-1);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
