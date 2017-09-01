import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 10:17 AM.
 */
public class _1078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        for (i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",i,n,i*n);
        }
    }
}
