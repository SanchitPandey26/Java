import java.util.Scanner;

public class Q5 {
    static int print(int num){
        if (num == 0) return 1;
        return num * print(num - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
