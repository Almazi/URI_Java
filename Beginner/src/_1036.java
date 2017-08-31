import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1036 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double r1 = 0;
        double r2 = 0;
        if((2 * a == 0) || ((Math.pow(b,2) - 4 * a * c) < 0)){
            System.out.printf("Impossivel calcular\n");
        }
        else {
            r1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
            r2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

    }
}
