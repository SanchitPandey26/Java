import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 1; i < n; i++){
            if (arr[i] == 0 && arr[i-1] != 0) j = i;
            if (arr[i] != 0 && arr[j] == 0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
