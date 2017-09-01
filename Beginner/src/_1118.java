import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 6:05 PM.
 */
public class _1118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        double media;
        int input;

        while (true){
            x = scan.nextDouble();
            while (x < 0 || x > 10.00){
                System.out.println("nota invalida");
                x = scan.nextDouble();
            }
            y = scan.nextDouble();
            while ((y < 0 || y > 10.00)){
                System.out.println("nota invalida");
                y = scan.nextDouble();
            }
            media = (x + y) / 2;
            System.out.printf("media = %.2f\n",media);

            System.out.printf("novo calculo (1-sim 2-nao)\n");
            input = scan.nextInt();
            while (input < 1 || input > 2) {
                    System.out.printf("novo calculo (1-sim 2-nao)\n");
                    input = scan.nextInt();
            }
            if (input == 1){
                continue;
            }
            else if (input == 2) break;

        }

    }
}
