import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 9:44 PM.
 */
public class _1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int first = 0, last, total = 0;
        if (x < y){
            first = x+1;
            last = y-1;
        }
        else {
            first = y+1;
            last = x-1;
        }
        while (first <= last){
            if (first % 2 != 0){
                total = total + first;
            }
            first++;
        }
        System.out.println(total);

    }
}
