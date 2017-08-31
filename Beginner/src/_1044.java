import java.util.Scanner;

/**
 * Created by almazi on y8/31/17.
 */
public class _1044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b % a == 0 || a % b == 0){
            System.out.printf("Sao Multiplos\n");
        }
        else {
            System.out.printf("Nao sao Multiplos\n");

        }
    }
}
