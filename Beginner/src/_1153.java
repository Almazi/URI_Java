import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 3:31 AM.
 */
public class _1153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = 1;
        while (n > 0){
            factorial = factorial * n;
            n--;
        }
        System.out.printf("%d\n",factorial);
    }
}
