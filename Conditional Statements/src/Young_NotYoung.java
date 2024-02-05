import java.util.Scanner;

public class Young_NotYoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of a person: ");
        int a = sc.nextInt();

        if (a>=14 && a<=55){
            System.out.println("The person is young.");
        }
        if (a<14 || a>55){
            System.out.println("The person is not young.");
        }
    }
}
