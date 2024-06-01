import java.util.Scanner;

public class Q1 {
    static void print(int num){
        if (num <= 0) return;
        System.out.print("Hey" + ' ');
        print(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n);
    }
}
