import java.util.Scanner;

/**
 * Created by almazi on 8/30/17.
 */
public class _1012 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double TRIANGULO = .5 * a * c;
        double CIRCULO = c * c * 3.14159;
        double TRAPEZIO = ((a+b)/2) * c;
        double QUADRADO = b * b;
        double RETANGULO = a * b;
        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);


    }
}
