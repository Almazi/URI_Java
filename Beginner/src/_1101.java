import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 4:26 PM.
 */
public class _1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt(), swap, sum = 0;

        while(m > 0 && n > 0){
            if (n < m){
                swap = m;
                m = n;
                n = swap;
            }
            while (m <= n){
                System.out.printf("%d ",m);
                sum += m;
                m++;
            }
            System.out.printf("Sum=%d\n",sum);
            sum = 0;
            m = scan.nextInt();
            n = scan.nextInt();
        }
    }
}
