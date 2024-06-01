import java.util.Scanner;

public class Q6 {
    static int print(int num){
        if (num == 0) return 0;
        else if (num == 1) return 1;
        return print(num - 1) + print(num -2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
