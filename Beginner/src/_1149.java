import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 2:08 AM.
 */
public class _1149 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int i, sum = 0;
        while (n <= 0){
            n = scan.nextInt();
        }
        for (i = x; i < (x + n); i++){
            sum += i;
        }
        System.out.printf("%d\n",sum);
    }
}
