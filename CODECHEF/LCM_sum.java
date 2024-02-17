import java.util.Scanner;

public class LCM_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; ++k) {
            long m = sc.nextLong();

            long i = 1;
            boolean booleanvalue = false;
            while (i < m - 1) {
                long j = i;
                while (j < m - 1) {
                    if ((m - i) % (2 * j) == 0) {
                        System.out.println("1 " + i + " " + (j * (m - i)) / (2 * j));
                        booleanvalue = true;
                        break;
                    }
                    j = 2 * j;
                }
                if (booleanvalue) break;
                i = i * 2;
            }

            if (!booleanvalue) System.out.println("-1");
        }
    }
}
