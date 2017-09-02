import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 11:33 AM.
 */
public class _1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i <= n){
            if(n  % i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
