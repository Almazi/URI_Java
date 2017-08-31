import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1040 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double N1 = scan.nextDouble();
        double N2 = scan.nextDouble();
        double N3 = scan.nextDouble();
        double N4 = scan.nextDouble();
        double score;

        double Media = (N1*2 + N2*3 + N3*4 + N4*1) / (2 + 3 + 4 + 1);
        System.out.printf("Media: %.1f\n",(float)Media);
        if(Media < 5.0){
            System.out.printf("Aluno reprovado.\n");
        }
        else if(Media >= 5.0 && Media <= 6.9){
            System.out.printf("Aluno em exame.\n");
            score = scan.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",score);
            Media = (Media + score) / 2;
            if(Media >= 5.0){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n",(float)Media);

            }
            else if(Media <= 4.9){
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n",(float)Media);

            }


        }
        else if(Media >= 7.0){
            System.out.printf("Aluno aprovado.\n");
        }

    }
}
