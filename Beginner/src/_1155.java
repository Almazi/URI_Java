/**
 * Created by almazi on 9/2/17, 10:50 AM.
 */
public class _1155 {
    public static void main(String[] args) {
        int i;
        double s = 0;
        for (i = 1; i <= 100; i++){
            s = s + (1.0 / i);
        }
        System.out.printf("%.2f\n", s);
    }
}
