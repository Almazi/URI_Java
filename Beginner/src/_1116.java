import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 5:01 PM.
 */
public class _1116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x, y;
        double division;
        while(n > 0){
            x = scan.nextInt();
            y = scan.nextInt();
            division = (double) x / (double) y;
            if (y == 0) System.out.printf("divisao impossivel\n");
            else {
                System.out.println(division);
            }
            n--;
        }
    }
}
