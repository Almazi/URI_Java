import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 10:43 AM.
 */
public class _1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int animals = 0, coelho = 0, rato = 0, sapo = 0, i, n, number;
        n = scan.nextInt();
        for( i = 0; i < n; i++){
            number = scan.nextInt();
            name = scan.next();
            animals = animals + number;
            if (name.equals("C")) coelho = coelho + number;
            if (name.equals("R")) rato = rato + number;
            if (name.equals("S")) sapo = sapo + number;
        }
        System.out.printf("Total: %d cobaias\n",animals);
        System.out.printf("Total de coelhos: %d\n",coelho);
        System.out.printf("Total de ratos: %d\n",rato);
        System.out.printf("Total de sapos: %d\n",sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (((double)coelho / animals) * 100.00));
        System.out.printf("Percentual de ratos: %.2f %%\n", (((double)rato / animals) * 100.00));
        System.out.printf("Percentual de sapos: %.2f %%\n", (((double)sapo / animals) * 100.00));
    }
}
