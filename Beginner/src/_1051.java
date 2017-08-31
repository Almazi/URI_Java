import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 8:41 PM.
 */
public class _1051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        double tax = 0;
        if (salary >= 0.00 && salary <= 2000.00){
            tax = 0;
            System.out.printf("Isento\n");
        }
        else if (salary >= 2000.01 && salary <= 3000.00){
            tax = ((salary - 2000.00) * 8 ) /100;
            System.out.printf("R$ %.2f\n",tax);
        }
        else if (salary >= 3000.01 && salary <= 4500.00){
            tax = ((1000.00 * 8 ) /100) + ((salary - 3000.00) * 18 ) /100;
            System.out.printf("R$ %.2f\n",tax);
        }
        else if (salary > 4500.00){
            tax = ((1000.00 * 8 ) /100) + ((1500.00 * 18 ) /100) + ((salary - 4500.00) * 28 ) /100;
            System.out.printf("R$ %.2f\n",tax);
        }
    }
}
