import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 12:56 AM.
 */
public class _1144 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i, j;
        for (i = 1; i <= n; i++){
            System.out.print(i + " ");
            System.out.print(i*i + " ");
            System.out.println(i*i*i);

            System.out.print(i + " ");
            System.out.print(i*i+1 + " ");
            System.out.println(i*i*i+1);

        }
    }
}

/*
1 1 1
1 2 2
2 4 8
2 5 9
3 9 27
3 10 28
4 16 64
4 17 65
5 25 125
5 26 126
*/