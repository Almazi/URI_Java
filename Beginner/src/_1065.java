import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 9:49 PM.
 */
public class _1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] input = new double[5];

        int i, counter = 0;
        for(i = 0; i < input.length; i++){
            input[i] = scan.nextDouble();
            if(input[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.printf("%d valores pares\n",counter);

    }

}
