import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 10:22 AM.
 */
public class _1079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        double first = 0, second = 0, third = 0, avg = 0;
        for (i = 0; i < n; i++){
            first = scan.nextDouble();
            second = scan.nextDouble();
            third = scan.nextDouble();
            avg = (first * 2 + second * 3 + third * 5) / (2 + 3 + 5);
            System.out.printf("%.1f\n",avg);
        }
    }
}
