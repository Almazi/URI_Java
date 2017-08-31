import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1021_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A,E;
        A = scan.nextDouble();
        int N,n100,b,n50,d,n20,f,n10,h,n5,j,n2,p1,B,m,p50,o,p25,q,p10,s,p05,p01;
        N = (int)A;
        System.out.printf ("%d N\n",N);

        n100 = N/100;
        b = N%100;
        n50 = b/50;
        d = b%50;
        n20 = d/20;
        f = d%20;
        n10 = f/10;
        h = f%10;
        n5 = h/5;
        j = h%5;
        n2 = j/2;
        p1 = j%2;

        E = A*100;
        System.out.printf ("%f E\n",E);

        B = (int)E;
        System.out.printf ("%d B\n",B);

        m = B%100;
        System.out.printf ("%d m\n",m);

        p50=m/50;
        o=m%50;
        p25=o/25;
        q=o%25;
        p10=q/10;
        s=q%10;
        p05=s/5;
        p01=s%5;

        System.out.printf ("NOTAS:\n");
        System.out.printf ("%d nota(s) de R$ 100.00\n",n100);
        System.out.printf ("%d nota(s) de R$ 50.00\n",n50);
        System.out.printf ("%d nota(s) de R$ 20.00\n",n20);
        System.out.printf ("%d nota(s) de R$ 10.00\n",n10);
        System.out.printf ("%d nota(s) de R$ 5.00\n",n5);
        System.out.printf ("%d nota(s) de R$ 2.00\n",n2);
        System.out.printf ("MOEDAS:\n");
        System.out.printf ("%d moeda(s) de R$ 1.00\n",p1);
        System.out.printf ("%d moeda(s) de R$ 0.50\n",p50);
        System.out.printf ("%d moeda(s) de R$ 0.25\n",p25);
        System.out.printf ("%d moeda(s) de R$ 0.10\n",p10);
        System.out.printf ("%d moeda(s) de R$ 0.05\n",p05);
        System.out.printf ("%d moeda(s) de R$ 0.01\n",p01);

    }
}
