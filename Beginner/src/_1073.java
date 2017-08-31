import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 11:06 PM.
 */
public class _1073 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        for(i = 1; i <= n; i++){
            if (i%2 == 0){
                System.out.printf("%d^2 = %d\n",i,i*i);
            }
        }
    }
}
