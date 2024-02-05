import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of first subject: ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of second subject: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of third subject: ");
        int c = sc.nextInt();

        int d = (a+b+c)/3;

        if (d>=75){
            System.out.println("The grade is A.");
        }
        else if (d>=60){
            System.out.println("The grade is B.");
        }
        else if (d>=50){
            System.out.println("The grade is C.");
        }
        else if (d>=40){
            System.out.println("The grade is D.");
        }
        else{
            System.out.println("The grade is F.");
        }
    }
}
