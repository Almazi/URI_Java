import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 11:31 PM.
 */
public class _1061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        string = scan.next();
        int startDay = scan.nextInt();
        int sHour = scan.nextInt();
        string = scan.next();
        int sMinute = scan.nextInt();
        string = scan.next();
        int sSeconds = scan.nextInt();
        string = scan.next();
        int endDay = scan.nextInt();
        int eHour = scan.nextInt();
        string = scan.next();
        int eMinute = scan.nextInt();
        string = scan.next();
        int eSeconds = scan.nextInt();
/*
        int sDay= Integer.parseInt(startDay.replaceAll("[^\\d.]", ""));
        int sHour = Integer.parseInt(startTime.replaceAll("[^\\d.]", "").substring(0,2));
        int sMinute = Integer.parseInt(startTime.replaceAll("[^\\d.]", "").substring(2,4));
        int sSeconds = Integer.parseInt(startTime.replaceAll("[^\\d.]", "").substring(4,6));


        int eDay= Integer.parseInt(endDay.replaceAll("[^\\d.]", ""));
        int eHour = Integer.parseInt(endTime.replaceAll("[^\\d.]", "").substring(0,2));
        int eMinute = Integer.parseInt(endTime.replaceAll("[^\\d.]", "").substring(2,4));
        int eSeconds = Integer.parseInt(endTime.replaceAll("[^\\d.]", "").substring(4,6));

        if(initialTotalSeconds < finalTotalSeconds){
            totalSeconds = finalTotalSeconds - initialTotalSeconds;
        }
        if(initialTotalSeconds >= finalTotalSeconds){
            totalSeconds = 86400 - (initialTotalSeconds - finalTotalSeconds);
        }

        if( totalHours == 24){
            totalDays = totalDays + 1;
            totalHours = 0;
        }
*/

        long initialTotalMinutes = startDay * 24 * 60 + sHour * 60 + sMinute;
        long initialTotalSeconds = initialTotalMinutes * 60 + sSeconds;
        long finalTotalMinutes = endDay * 24 * 60 + eHour * 60 + eMinute;
        long finalTotalSeconds = finalTotalMinutes * 60 + eSeconds;
        long totalSeconds = (endDay - startDay) * 24 * 60 * 60 + (eHour - sHour) * 60 * 60 + (eMinute - sMinute) * 60 + (eSeconds - sSeconds);


        long totalDays = totalSeconds / (3600 * 24);
        totalSeconds = totalSeconds % (3600 * 24);
        long totalHours = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;
        long totalMinutes = totalSeconds / 60;
        totalSeconds = totalSeconds % 60;


        System.out.printf("%d dia(s)\n",totalDays);
        System.out.printf("%d hora(s)\n",totalHours);
        System.out.printf("%d minuto(s)\n",totalMinutes);
        System.out.printf("%d segundo(s)\n",totalSeconds);

    }

}
