import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 1; i < n; i++){
            if (arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(j+1);

        for (int i = 0; i < j + 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
