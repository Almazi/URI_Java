import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalSeconds = scan.nextInt();

        int hour = totalSeconds / (60*60);
        totalSeconds = totalSeconds % (60*60);
        int minute = totalSeconds / 60;
        totalSeconds = totalSeconds % 60;
        int second = totalSeconds;

        System.out.printf("%d:%d:%d\n",hour,minute,second);

    }
}
