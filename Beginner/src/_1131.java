import java.util.Scanner;

/**
 * Created by almazi on 9/1/17, 6:43 PM.
 */
public class _1131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int inter, gremio, winInter = 0, winGremio = 0, draw = 0, totalgame = 0;
        inter = scan.nextInt();
        gremio = scan.nextInt();
        if (inter > gremio) winInter++;
        if (gremio > inter) winGremio++;
        if (gremio == inter) draw++;
        totalgame++;
        System.out.printf("Novo grenal (1-sim 2-nao)\n");
        input = scan.nextInt();
        while (input == 1){
            totalgame++;
            inter = scan.nextInt();
            gremio = scan.nextInt();
            if (inter > gremio) winInter++;
            if (gremio > inter) winGremio++;
            if (gremio == inter) draw++;
            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            input = scan.nextInt();
        }
        System.out.printf("%d grenais\n",totalgame);
        System.out.printf("Inter:%d\n",winInter);
        System.out.printf("Gremio:%d\n",winGremio);
        System.out.printf("Empates:%d\n",draw);
        if (winInter > winGremio) System.out.printf("Inter venceu mais\n");
        else if (winGremio > winInter) System.out.printf("Gremio venceu mais\n");
        else System.out.printf("Não houve vencedor\n");
    }
}
