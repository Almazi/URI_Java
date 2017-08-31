import java.util.Scanner;

/**
 * Created by almazi on 8/31/17.
 */
public class _1042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, swap;
        int[] values = new int[3];
        int[] sortThis = new int[3];

        for(i = 0; i < 3; i++){
            swap = scan.nextInt();
            values[i] = swap;
            sortThis[i] = swap;
        }

        for(i = 0; i < 2; i++)
            for (j = i + 1; j < 3; j++){
                if (sortThis[i] >= sortThis[j]){
                    swap = sortThis[i];
                    sortThis[i] = sortThis[j];
                    sortThis[j] = swap;
                }
            }
        for(i = 0; i < 3; i++){
            System.out.printf("%d\n",sortThis[i]);
        }
        System.out.printf("\n");

        for(i = 0; i < 3; i++){
            System.out.printf("%d\n",values[i]);
        }

    }
}
