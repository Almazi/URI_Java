import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 9:44 PM.
 */
public class _1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = scan.nextInt();
        int odd = 0;
        while (odd <= counter){
            if (odd % 2 != 0){
                System.out.println(odd);
            }
            odd++;
        }
    }
}
