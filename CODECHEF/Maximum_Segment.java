
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Maximum_Segment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; ++k) {
            int m = sc.nextInt();

            int[] asach = new int[m];
            for (int i = 0; i < m; ++i) {
                asach[i] = sc.nextInt();
            }

            int[] myarray = new int[m + 1];
            int var = 0;
            for (int i = 1; i <= m; ++i) {
                myarray[i] = asach[i - 1];
                var = Math.max(myarray[i], var);
            }

            Set<Integer> myset = new HashSet<>();
            for (int i = 1; i <= m; ++i) {
                if (myset.contains(myarray[i])) {
                    System.out.print(var + " ");
                } else {
                    System.out.print(myarray[i] + " ");
                }
                myset.add(myarray[i]);
            }
            System.out.println();
        }
    }
}
