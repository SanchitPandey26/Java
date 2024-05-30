import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),num = 0;
        while (n != 0){
            if (num > Integer.MAX_VALUE/10 || num < Integer.MIN_VALUE/10){
                num = 0;
                break;
            }
            num = num * 10 + n % 10;
            n /= 10;
        }

        System.out.println(num);
    }
}
