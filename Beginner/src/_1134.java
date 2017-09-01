import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 12:37 AM.
 */
public class _1134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Alcool = 0, Gasolina = 0, Diesel = 0;
        int input;
        while (true){
            input = scan.nextInt();
            if (input == 1) Alcool++;
            if (input == 2) Gasolina++;
            if (input == 3) Diesel++;
            if (input == 4) break;
            else continue;

        }
        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n",Alcool);
        System.out.printf("Gasolina: %d\n",Gasolina);
        System.out.printf("Diesel: %d\n",Diesel);
    }
}
