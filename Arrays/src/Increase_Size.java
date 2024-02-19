import java.util.Scanner;

public class Increase_Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr_1 = new int[n], arr_2 = new int[2*n];

        for (int i = 0; i < n; i++){
            arr_1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            arr_2[i] = arr_1[i];
        }
        arr_1 = arr_2;

        for (int x : arr_1){
            System.out.print(x + " ");
        }
    }
}
