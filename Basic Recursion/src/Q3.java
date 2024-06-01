import java.util.Scanner;

public class Q3 {
    static void print(int num){
        if (num <= 0) return;
        print(num-1);
        System.out.print(num);
        System.out.print(' ');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n);
    }
}
