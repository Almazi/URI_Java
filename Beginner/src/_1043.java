import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1043 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if(a + b > c && b + c > a && c + a > b){
            System.out.printf("Perimetro = %.1f\n", (a+b+c));
        }
        else {
            System.out.printf("Area = %.1f\n", (((a+b) * c)/2));
        }
    }
}
