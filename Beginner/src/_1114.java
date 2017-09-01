import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 4:43 PM.
 */
public class _1114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, password = 2002;
        do{
            input = scan.nextInt();
            if (input == password) System.out.println("Acesso Permitido");
            else System.out.println("Senha Invalida");
        } while (input != password);


    }
}
