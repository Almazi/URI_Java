import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double salary = scan.nextDouble();
        double totalSold = scan.nextDouble();
        double salaryWithBonus = salary + ((totalSold*15)/100);
        System.out.printf("TOTAL = R$ %.2f\n", salaryWithBonus);
    }

}
