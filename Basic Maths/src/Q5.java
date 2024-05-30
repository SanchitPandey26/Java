import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), sum = 0, digit;
        int t = n;
        while (t > 0){
            digit = t % 10;
            sum += digit * digit * digit;
            t /= 10;
        }
        if (sum == n) System.out.println("Yes");
        else System.out.println("No");
    }
}
