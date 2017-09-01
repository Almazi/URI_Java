import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 12:56 AM.
 */
public class _1142 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i, j, counter = 1;
        for (i = 0; i < n; i++){
            for (j = 0; j < 3; j++){
                System.out.printf("%d ",counter);
                counter++;
            }
            System.out.printf("PUM\n");
            counter++;
        }
    }
}

/*
        1 2 3 PUM
        5 6 7 PUM
        9 10 11 PUM
        13 14 15 PUM
        17 18 19 PUM
        21 22 23 PUM
        25 26 27 PUM
  */