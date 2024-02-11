import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0, m = n, r;

        while (m!=0){
            r = m % 10;
            rev = rev * 10 + r;
            m = m / 10;
        }
        if (rev == n){
            System.out.println("The number is a Palindrome number.");
        }
        else{
            System.out.println("The number is not a Palindrome number.");
        }
    }
}