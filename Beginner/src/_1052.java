import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 9:29 PM.
 */
public class _1052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month){
            case 1:
                System.out.printf("January\n");
                break;
            case 2:
                System.out.printf("February\n");
                break;
            case 3:
                System.out.printf("March\n");
                break;
            case 4:
                System.out.printf("April\n");
                break;
            case 5:
                System.out.printf("May\n");
                break;
            case 6:
                System.out.printf("June\n");
                break;
            case 7:
                System.out.printf("July\n");
                break;
            case 8:
                System.out.printf("August\n");
                break;
            case 9:
                System.out.printf("September\n");
                break;
            case 10:
                System.out.printf("October\n");
                break;
            case 11:
                System.out.printf("November\n");
                break;
            case 12:
                System.out.printf("December\n");
                break;
            default:
                break;

        }

    }
}
