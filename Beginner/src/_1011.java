import java.util.Scanner;

public class _1011 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double VOLUME = (4.0/3) * 3.14159 * (r*r*r);
        System.out.printf("VOLUME = %.3f\n", VOLUME);
    }

}
