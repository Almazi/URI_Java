import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startTime = scan.nextInt();
        int endTime = scan.nextInt();
        int total = 0;

        if(startTime < 12 && endTime > 12){
            total = endTime - startTime;
        }
        else {
            total = 24 - (startTime - endTime);

        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",total);
    }
}

/*

1. start 12- end 12-
2. start 12+ end 12-
3. start 12+ end 12+
 */




