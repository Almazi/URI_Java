import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 11:38 AM.
 */
public class _1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x, y, sum;
        while(n > 0) {
            x = scan.nextInt();
            y = scan.nextInt();
            sum = 0;
            while (y > 0) {
                if (x % 2 != 0){
                    sum = sum + x;
                    y--;
                }
                x++;
            }
            System.out.printf("%d\n", sum);
            n--;
        }
    }
}
