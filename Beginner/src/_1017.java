import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilometers = scan.nextInt();
        int hour = scan.nextInt();
        double consumption = (double)((kilometers*hour) / 12.0);
        System.out.printf("%.3f\n",consumption);
    }
}
