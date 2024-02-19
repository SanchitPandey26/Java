import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c], mat = new int[r][c], a = new int[r][c];

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                a[i][j] = 0;
                for (int k = 0; k < r; k++) {
                    a[i][j] += arr[i][k] * mat[k][j];
                }
            }
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
