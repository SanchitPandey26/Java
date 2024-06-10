import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans;
        int sum1 = n * (n+1)/2, sum2 = 0;
        for (int i = 0; i < n; i++){
            sum2 += arr[i];
        }
        ans = sum1-sum2;
        System.out.println(ans);
    }
}
