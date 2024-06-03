import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxfreq =  0, minfreq = n, maxele = 0, minele = 0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if (count > maxfreq){
                maxfreq = count;
                maxele = element;
            }
            if (count < minfreq){
                minfreq = count;
                minele = element;
            }
        }

        System.out.println(maxele + " " + minele);
    }
}
