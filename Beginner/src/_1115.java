import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 4:49 PM.
 */
public class _1115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();

        while(x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.printf("primeiro\n");
            } else if (x > 0 && y < 0) {
                System.out.printf("quarto\n");
            } else if (x < 0 && y > 0) {
                System.out.printf("segundo\n");
            } else if (x < 0 && y < 0) {
                System.out.printf("terceiro\n");
            }
            x = scan.nextInt();
            y = scan.nextInt();

        }
    }
}
