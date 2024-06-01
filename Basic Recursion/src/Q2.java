import java.util.Scanner;

public class Q2 {
    static void print(int num){
        if (num <= 0) return;
        System.out.print(num);
        System.out.print(' ');
        print(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n);
    }
}
