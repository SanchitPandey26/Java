import java.util.Scanner;

public class Method_Overloading {
    static double area(double l, double b){
        double a = l * b;
        return a;
    }
    static double area(double r){
        double a = Math.PI * r * r;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shape: ");
        String shape = sc.nextLine();
        switch (shape){
            case "Rectangle":
                System.out.print("Enter the length and breadth: ");
                double l =  sc.nextDouble(), b = sc.nextDouble();
                System.out.println("Area is " + area(l,b));
                break;
            case "Circle":
                System.out.print("Enter the radius of circle: ");
                double r = sc.nextDouble();
                System.out.println("Area is " + area(r));
                break;
        }
    }
}
