import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 5:08 PM.
 */

public class _1117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        double y = scan.nextDouble();

        double media;
        while(true){
            if((x < 0 || x > 10.00)){
                System.out.println("nota invalida");
                x = scan.nextDouble();
                continue;
            }
            if((y < 0 || y > 10.00)){
                System.out.println("nota invalida");
                y = scan.nextDouble();
                continue;
            }
            media = (x+y) / 2;
            System.out.printf("media = %.2f\n",media);
            break;
        }

    }
    /*private static double validator(double a){
        Scanner scan = new Scanner(System.in);
        if((a < 0 || a > 10.00)) {
            System.out.println("nota invalida");
            a = scan.nextDouble();
            validator(a);
        }
        return a;
    }*/
}
