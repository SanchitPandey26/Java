import java.util.Scanner;

public class Calculate_Area {
    public static void main(String[] args) {

        /*
        Calculating area of triangle using height and base

        float b, h, a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of triangle: ");
        b = sc.nextFloat();
        System.out.print("Enter the height of triangle: ");
        h = sc.nextFloat();

        a = b * h/2;        // a = b * h * 0.5f;
        System.out.println("The area of triangle is " + a);
         */


        // Calculating area of triangle using the three sides

        double a, b, c, s, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of first side of triangle: ");
        a = sc.nextFloat();
        System.out.print("Enter the length of second side of triangle: ");
        b = sc.nextFloat();
        System.out.print("Enter the length of third side of triangle: ");
        c = sc.nextFloat();

        s = (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("The area of triangle is: " + area);

    }
}
