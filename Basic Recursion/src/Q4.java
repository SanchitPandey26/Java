import java.util.Scanner;

public class Q4 {
    static int print(int num){
        if (num <= 0) return 0;
        return num*num*num + print(num - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
