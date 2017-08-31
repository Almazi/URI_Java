import java.util.Scanner;
/**
 * Created by almazi on 8/29/17.
 */
public class _1013 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int maior = (a + b + Math.abs(a - b))/2;
        maior = (maior + c + Math.abs(maior - c))/2;
        System.out.printf(maior + " eh o maior\n");
    }
}
