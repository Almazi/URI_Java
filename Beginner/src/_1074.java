import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 11:14 PM.
 */
public class _1074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];

        int i;
        for(i = 0; i < input.length; i++){
            input[i] = scan.nextInt();
            if(input[i] % 2 != 0){
                if(input[i] > 0) System.out.printf("ODD POSITIVE\n");
                if(input[i] < 0) System.out.printf("ODD NEGATIVE\n");
            }
            if(input[i] % 2 == 0){
                if(input[i] > 0) System.out.printf("EVEN POSITIVE\n");
                if(input[i] < 0) System.out.printf("EVEN NEGATIVE\n");
            }
            if(input[i] == 0) System.out.printf("NULL\n");


        }
    }
}
