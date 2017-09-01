import java.util.Scanner;

/**
 * Created by almazi on 9/2/17, 12:56 AM.
 */
public class _1143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i, j;
        for (i = 1; i <= n; i++){
            System.out.print(i + " ");
            System.out.print(i*i + " ");
            System.out.println(i*i*i);

        }
    }
}

/*
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
  */