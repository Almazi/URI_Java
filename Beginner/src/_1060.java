import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 9:49 PM.
 */
public class _1060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] input = new double[6];

        int i, counter = 0;
        for(i = 0; i < 6; i++){
            input[i] = scan.nextDouble();
            if(input[i] > 0) counter++;
        }
        System.out.printf("%d valores positivos\n",counter);

    }

}
