import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1041 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if (x == 0 && y != 0){
            System.out.printf("Eixo Y\n");
        }
        else if (y == 0 && x != 0){
            System.out.printf("Eixo X\n");
        }
        else if (x == 0 && y == 0){
            System.out.printf("Origem\n");
        }
        else if (x > 0 && y > 0){
            System.out.printf("Q1\n");
        }
        else if (x > 0 && y < 0){
            System.out.printf("Q4\n");
        }
        else if (x < 0 && y > 0){
            System.out.printf("Q2\n");
        }
        else if (x < 0 && y < 0){
            System.out.printf("Q3\n");
        }

    }
}
