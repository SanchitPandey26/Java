import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int a = n1, b = n2;
        while (a>0 && b>0){
            if (a > b) a %= b;
            else b %= a;
        }
        if (a==0) System.out.println(b);
        if (b==0) System.out.println(a);
    }
}
