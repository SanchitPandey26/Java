import java.util.Scanner;

public class Prime_Number {
    static boolean prime(int x){
        for (int i = 2; i < x/2; i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println(prime(a));
    }
}
