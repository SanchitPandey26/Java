import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), r = 0, x = n;
        if (n < 0) System.out.println(false);
        else{
            while (n != 0){
                r = r * 10 + n % 10;
                n /= 10;
            }
            System.out.println(x == r);
        }
    }
}
