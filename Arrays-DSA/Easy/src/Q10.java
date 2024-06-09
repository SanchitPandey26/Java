import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < k){
            if (a[i] <= b[j]){
                if (list.isEmpty() || list.getLast() != a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if (list.isEmpty() || list.getLast() != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while (i < n){
            if (list.isEmpty() || list.getLast() != a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while (j < k){
            if (list.isEmpty() || list.getLast() != b[j]){
                list.add(b[j]);
            }
            j++;
        }
        for (int q = 0; q < list.size(); q++){
            System.out.print(list.get(q) + " ");
        }
    }
}
