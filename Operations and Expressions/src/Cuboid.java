import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        float l, h, b, total_area, volume;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the room: ");
        l = sc.nextFloat();
        System.out.print("Enter the height of the room: ");
        h = sc.nextFloat();
        System.out.print("Enter the breadth of the room: ");
        b = sc.nextFloat();

        total_area = 2*((l*h) + (l*b) + (h*b));
        volume = l * h * b;

        System.out.println("The total surface area of cuboid is " + total_area);
        System.out.println("The volume of cuboid is " + volume);

    }
}
