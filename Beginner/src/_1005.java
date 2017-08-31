import java.util.Scanner;

/**
 * Created by almazi on 8/29/17.
 */
public class _1005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double MEDIA = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
