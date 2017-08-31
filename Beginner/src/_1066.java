import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 10:49 PM.
 */
public class _1066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[5];

        int i, odd = 0, even = 0, pos = 0, neg = 0;
        for(i = 0; i < input.length; i++){
            input[i] = scan.nextInt();
            if(input[i] % 2 != 0) odd++;
            if(input[i] % 2 == 0) even++;
            if(input[i] > 0) pos++;
            if(input[i] < 0) neg++;

        }
        System.out.printf("%d valor(es) par(es)\n",even);
        System.out.printf("%d valor(es) impar(es)\n",odd);
        System.out.printf("%d valor(es) positivo(s)\n",pos);
        System.out.printf("%d valor(es) negativo(s)\n",neg);

    }
}
