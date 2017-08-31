import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();

        int year = days / 365;
        days = days % 365;
        int month = days / 30;
        days = days % 30;
        int day = days;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",year,month,day);

    }
}
