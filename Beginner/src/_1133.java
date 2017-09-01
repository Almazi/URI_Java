import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 7:12 PM.
 */
public class _1133 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int swap;
        if (y < x){
            swap = x;
            x = y;
            y = swap;
        }
        x++;
        while (x < y){
            if (x % 5 == 2 || x % 5 == 3) System.out.printf("%d\n",x);
            x++;
        };
    }
}
