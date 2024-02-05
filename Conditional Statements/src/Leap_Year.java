import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int a = sc.nextInt();

        if (a%4==0 && a%100==0 && a%400==0){
            System.out.println("The year is a leap year.");
        }
        else if (a%4==0 && a%100!=0) {
            System.out.println("The year is a leap year.");
        }
        else{
            System.out.println("The year is not a leap year.");
        }
    }
}
