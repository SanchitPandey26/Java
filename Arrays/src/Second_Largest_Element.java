import java.util.Scanner;

public class Second_Largest_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt(), max = 0, max_2 = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (max < arr[i]){
                max_2 = max;
                max = arr[i];
            }
        }
        System.out.println(max_2);

    }
}