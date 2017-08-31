import java.util.Scanner;

public class _1010 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int firstProductCode = scan.nextInt();
        int firstProductNumber = scan.nextInt();
        float firstProductValue = scan.nextFloat();
        float firstProductTotal = firstProductNumber*firstProductValue;
        int secondProductCode = scan.nextInt();
        int secondProductNumber = scan.nextInt();
        float secondProductValue = scan.nextFloat();
        float secondProductTotal = secondProductNumber*secondProductValue;

        float total = firstProductTotal + secondProductTotal;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }

}
