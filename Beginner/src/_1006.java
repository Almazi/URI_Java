import java.util.Scanner;

/**
 * Created by almazi on 8/29/17.
 */
public class _1006 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double MEDIA = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 +5);
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
