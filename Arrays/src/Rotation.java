import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int a = arr[n-1];

        for (int i = n-1; i > 0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = a;

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
