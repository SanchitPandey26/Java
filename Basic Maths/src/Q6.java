import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i * i<= n; i++){
            if (n % i == 0){
                list.add(i);
                if (n/i != i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x);
            System.out.print(' ');
        }
    }
}
