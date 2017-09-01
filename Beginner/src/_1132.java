import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 7:12 PM.
 */
public class _1132 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int swap, sum = 0;
        if (y < x){
            swap = x;
            x = y;
            y = swap;
        }
        while (x <= y){
            if (x % 13 !=  0) sum = sum + x;
            x++;
        }
        System.out.printf("%d\n",sum);
    }
}
