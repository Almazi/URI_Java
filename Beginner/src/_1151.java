import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 3:15 AM.
 */
public class _1151 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = -1, b = 1, sum = 0, i, swap;
        for (i = 1; i <= n; i++){
            sum = a + b;
            if (i < n) System.out.printf("%d ",sum);
            else System.out.println(sum);
            a = b;
            b = sum;
        }
    }

}
