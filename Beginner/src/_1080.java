import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 10:30 AM.
 */
public class _1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int i, highest = 0, position = 0;
        for (i = 1; i <= 100; i++){
            input = scan.nextInt();
            if(highest < input){
                highest = input;
                position = i;
            }
        }
        System.out.printf("%d\n%d\n",highest,position);
    }
}
