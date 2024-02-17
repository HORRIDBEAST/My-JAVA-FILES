import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String position = sc.next();
            char cm = position.charAt(0);
            char rw = position.charAt(1);

            // Output the possible moves for the rook
            for (char c = 'a'; c <= 'h'; c++) {
                if (c != cm) {
                    System.out.println(c + "" + rw);
                }
            }

            for (char r = '1'; r <= '8'; r++) {
                if (r != rw) {
                    System.out.println(cm + "" + r);
                }
            }
        }
    }
}
