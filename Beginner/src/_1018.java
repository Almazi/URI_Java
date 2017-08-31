import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.printf(amount+"\n");

        int no100 = amount / 100;
        System.out.printf("%d nota(s) de R$ 100,00\n",no100);

        amount = amount % 100;
        int no50 = amount / 50;
        System.out.printf("%d nota(s) de R$ 50,00\n",no50);
        amount = amount % 50;
        int no20 = amount / 20;
        System.out.printf("%d nota(s) de R$ 20,00\n",no20);
        amount = amount % 20;
        int no10 = amount / 10;
        System.out.printf("%d nota(s) de R$ 10,00\n",no10);
        amount = amount % 10;
        int no5 = amount / 5;
        System.out.printf("%d nota(s) de R$ 5,00\n",no5);
        amount = amount % 5;
        int no2 = amount / 2;
        System.out.printf("%d nota(s) de R$ 2,00\n",no2);
        amount = amount % 2;
        int no1 = amount / 1;
        System.out.printf("%d nota(s) de R$ 1,00\n",no1);

    }
}
