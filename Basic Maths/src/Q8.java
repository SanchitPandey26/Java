import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean flag = true;
        if (n == 0 || n == 1) flag = false;
        else{
            for (int i = 2; i * i <= n; i++){
                if (n % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
