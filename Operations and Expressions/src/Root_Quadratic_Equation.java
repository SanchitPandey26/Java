import java.util.Scanner;

public class Root_Quadratic_Equation {
    public static void main(String[] args) {
        int a, b, c;
        double d, r1, r2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();

        d = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        if (!(d >= 0))
        {
            System.out.println("The quadratic equation has no real roots.");
        }
        else
        {
            r1 = (-b + d)/2;
            r2 = (-b - d)/2;
            System.out.println("The two roots of quadratic equation are " + r1 + ", " + r2);
        }

    }
}
