import java.util.Scanner;

/**
 * Created by almazi on 8/30/17.
 */
public class _1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        double Y = scan.nextDouble();
        double averageConsumption = X / Y;
        System.out.printf("%.3f km/l\n",averageConsumption);
    }
}
