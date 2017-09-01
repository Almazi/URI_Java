import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 4:09 PM.
 */
public class _1099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x, y, i, swap, oddSum = 0;
        for (i = 0; i < n; i++){
            oddSum = 0;
            x = scan.nextInt();
            y = scan.nextInt();
            if (y < x){
                swap = x;
                x = y;
                y = swap;
            }
            while (x < y-1){
                x++;
                if (x % 2 != 0) oddSum += x;
            }
            System.out.println(oddSum);
        }
    }

}
