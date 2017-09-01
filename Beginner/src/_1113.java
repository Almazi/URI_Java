import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 4:26 PM.
 */
public class _1113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();

        while(m != n){
            if (m > n) System.out.printf("Decrescente\n");
            else  System.out.printf("Crescente\n");
            m = scan.nextInt();
            n = scan.nextInt();
        }
    }
}
