import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1037 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        if((a < 0) || (a > 100)){
            System.out.printf("Fora de intervalo\n");
        }
        else {
            if( a >= 0 && a <= 25.0000){
                System.out.printf("Intervalo [0,25]\n");
            }
            else if ( a > 25.0000 && a <= 50.0000){
                System.out.printf("Intervalo (25,50]\n");
            }
            else if ( a > 50.0000 && a <= 75.0000){
                System.out.printf("Intervalo (50,75]\n");
            }
            else if ( a > 75.0000 && a <= 100.0000){
                System.out.printf("Intervalo (75,100]\n");
            }
        }

    }
}
