import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
