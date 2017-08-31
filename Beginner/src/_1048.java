import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 6:52 PM.
 */
public class _1048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        double increase = 0.00;
        int percent = 0;

        if(salary >= 0 && salary <= 400.00){
            percent = 15;
            increase = (salary*percent)/100;
            salary = salary + increase;
        }
        else if(salary >= 400.01 && salary <= 800.00){
            percent = 12;
            increase = (salary*percent)/100;
            salary = salary + increase;
        }
        else if(salary >= 800.01 && salary <= 1200.00){
            percent = 10;
            increase = (salary*percent)/100;
            salary = salary + increase;
        }
        else if(salary >= 1200.01 && salary <= 2000.00){
            percent = 7;
            increase = (salary*percent)/100;
            salary = salary + increase;
        }
        else if(salary > 2000.00){
            percent = 4;
            increase = (salary*percent)/100;
            salary = salary + increase;
        }
        System.out.printf("Novo salario: %.2f\n",salary);
        System.out.printf("Reajuste ganho: %.2f\n",increase);
        System.out.printf("Em percentual: %d %%\n",percent);
    }
}
