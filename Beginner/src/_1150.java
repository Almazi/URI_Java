import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 2:26 AM.
 */
public class _1150 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int z = scan.nextInt();
        int counter = 1, sum = 0, i;
        while (z <= x){
            z = scan.nextInt();
        }
        for(i = x; i < z; i++) {
            sum += i;
            if (sum > z) break;
            counter++;
        }
        System.out.println(counter);
    }
}


