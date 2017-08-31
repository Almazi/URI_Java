import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 9:44 PM.
 */
public class _1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int odd = scan.nextInt();
        int counter = 0;
        odd++;
        while (counter < 6){
            if (odd % 2 != 0){
                System.out.println(odd);
                counter++;
            }
            odd++;
        }
    }
}
