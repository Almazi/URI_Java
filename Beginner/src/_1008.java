import java.util.Scanner;

public class _1008 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int employeeNumber = scan.nextInt();
        int workedHours = scan.nextInt();
        float salaryPerHr = scan.nextFloat();
        float totalSalary = workedHours * salaryPerHr;
        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", totalSalary);
    }

}
