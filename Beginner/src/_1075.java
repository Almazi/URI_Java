import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 10:07 AM.
 */
public class _1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int i;
        for (i = 1; i <= 10000; i++){
            if (i % input == 2){
                System.out.printf("%d\n",i);
            }
        }

    }
}
