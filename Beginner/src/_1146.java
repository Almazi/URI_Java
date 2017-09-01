import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 1:52 AM.
 */
public class _1146 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int i;
        while (x > 0) {
            for (i = 1; i <= x; i++) {
                if (i == x) System.out.println(i);
                else System.out.print(i + " ");
            }
            x = scan.nextInt();
        }
    }
}
