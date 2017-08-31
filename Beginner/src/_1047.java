import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialHour = scan.nextInt();
        int initialMinute = scan.nextInt();
        int initialTotalMinutes = initialHour*60 + initialMinute;
        int finalHour = scan.nextInt();
        int finalMinute = scan.nextInt();
        int finalTotalMinutes = finalHour*60 + finalMinute;

        int totalHours;
        int totalMinutes = 0;

        /*
        1. 7200+ theke 7200+
        2. 7200+ theke 7200 and less
        3. 7200 and less theke 7200+
        4. 7200 and less theke 7200 and less
         */

        if(initialTotalMinutes < finalTotalMinutes){
            totalMinutes = finalTotalMinutes - initialTotalMinutes;
        }
        if(initialTotalMinutes >= finalTotalMinutes){
            totalMinutes = 1440 - (initialTotalMinutes - finalTotalMinutes);
        }

        totalHours = totalMinutes / 60;
        totalMinutes = totalMinutes % 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",totalHours,totalMinutes);
    }
}
