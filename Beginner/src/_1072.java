import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 10:59 PM.
 */
public class _1072 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[] values = new int[n];
        int i, in = 0, out = 0;
        for(i = 0; i < n; i++){
            values[i] = scan.nextInt();
            if (values[i] >= 10 && values[i] <= 20) in++;
            else out++;
        }
        System.out.printf("%d in\n%d out\n",in,out);
    }
}
