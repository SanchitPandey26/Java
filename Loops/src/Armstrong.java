import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0, r, a = n;

        while (a!=0) {
            r = a % 10;
            sum = sum + (r * r * r);
            a = a / 10;
        }
        if (sum == n){
            System.out.println("The number is Armstrong number.");
        }
        else{
            System.out.println("The number is not armstrong number.");
        }
    }
}
