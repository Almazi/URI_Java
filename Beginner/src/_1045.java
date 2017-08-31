import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1045 {
    public static void main(String[] args) {
        int i, j;
        double swap;

        Scanner scan = new Scanner(System.in);
        double[] values = new double[3];

        for(i = 0; i < 3; i++){
            values[i] = scan.nextDouble();
        }
        for(i = 0; i < 2; i++)
            for (j = i + 1; j < 3; j++){
                if (values[i] <= values[j]){
                    swap = values[i];
                    values[i] = values[j];
                    values[j] = swap;
                }
            }
        double a = values[0];
        double b = values[1];
        double c = values[2];
/*      if A ≥ B + C, write the message: NAO FORMA TRIANGULO
        if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
        if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
        if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
        if the three sides are the same size, write the message: TRIANGULO EQUILATERO
        if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES*/

        if (a >= b + c){
            System.out.printf("NAO FORMA TRIANGULO\n");
        }
        else if(a*a == b*b + c*c){
            System.out.printf("TRIANGULO RETANGULO\n");
        }
        else if(a*a > b*b + c*c){
            System.out.printf("TRIANGULO OBTUSANGULO\n");
        }
        else if(a*a < b*b + c*c){
            System.out.printf("TRIANGULO ACUTANGULO\n");
        }


        if(a == b && b == c){
            System.out.printf("TRIANGULO EQUILATERO\n");
        }
        else if((a == b && b != c) || (b == c && c != a) || (c == a && a != b) ){
            System.out.printf("TRIANGULO ISOSCELES\n");
        }
    }
}
