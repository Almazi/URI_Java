/**
 * Created by almazi on 9/1/17, 11:16 AM.
 */
public class _1097 {
    public static void main(String[] args) {
        int i, j, n = 7;
        for (i = 1; i <= 9; i+=2){
            for (j=n; j >= (n - 2); j--){
                System.out.printf("I=%d J=%d\n",i,j);
            }
            n += 2;
        }
    }
}

/*
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13*/
