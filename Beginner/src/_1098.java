/**
 * Created by almazi on 9/1/17, 11:16 AM.
 */
public class _1098 {
    public static void main(String[] args) {
        int j;
        double i;
        float dec;
        for (i = 0; i <= 2; i = i + .2){
            for (j = (int)(float)i + 1; j <= (int)(float)i + 3; j++){
                dec = (float)i;
                dec = (dec - (int)dec);
                if(dec == 0.0000) System.out.printf("I=%d J=%d\n",(int)(float)i,(int)(j+dec));
                else System.out.printf("I=%.1f J=%.1f\n",i,j+dec);
            }
        }
    }
}

/*
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?

for (j=1; j <= 3; j--){
                System.out.printf("I=%f J=%f\n",i,j+(i % 10));
            }
*/
