import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 12:03 PM.
 */
public class _1159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum, i = 0;
        while (x > 0) {
            sum = 0;

            while (i < 5) {
                if (x % 2 == 0){
                    sum += x;
                    i++;
                }
                x++;
            }
            System.out.println(sum);
            x = scan.nextInt();
        }
    }
}
