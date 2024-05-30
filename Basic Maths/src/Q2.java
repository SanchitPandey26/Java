import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), digit, count = 0, temp = n;
        while (temp > 0){
            digit = temp % 10;
            if (n % digit == 0){
                count++;
            }
            temp /= 10;
        }
        System.out.println(count);

    }
}
