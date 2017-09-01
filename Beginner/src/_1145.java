import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 1:33 AM.
 */
public class _1145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int i = 1, j;
        while (i <= y){
            for (j = 1; j <= x; j++){
                if (j == x) System.out.print(i);
                else System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }
}
