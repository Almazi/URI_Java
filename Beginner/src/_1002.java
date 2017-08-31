import java.util.Scanner;

/**
 * Created by almazi on 8/29/17.
 */
public class _1002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double area = 3.14159 * a * a;
        System.out.printf("A=%.4f\n", area);
    }
}
