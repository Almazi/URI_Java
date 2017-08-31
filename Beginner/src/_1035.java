import java.util.Scanner;

public class _1035 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        //If B is greater than C and D is greater than A and if
        // the sum of C and D is greater than the sum of A and B and if
        // C and D were positives values and if A is even,
        // write the message “Valores aceitos” (Accepted values).
        // Otherwise, write the message “Valores nao aceitos”
        // (Values not accepted).
        if(((B > C) && (D > A)) && ((C + D) > (A + B)) && ((C > 0 && D > 0)) &&
        ((A % 2 == 0))){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

    }

}
