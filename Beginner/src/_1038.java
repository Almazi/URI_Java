import java.util.Scanner;

public class _1038 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        double total = 0;
        if(X == 1){
            total = Y * 4.00;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if(X == 2){
            total = Y * 4.50;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if(X == 3){
            total = Y * 5.00;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if(X == 4){
            total = Y * 2.00;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if(X == 5){
            total = Y * 1.50;
            System.out.printf("Total: R$ %.2f\n",total);
        }

    }

}
