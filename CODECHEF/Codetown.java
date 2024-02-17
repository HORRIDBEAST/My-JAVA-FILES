import java.util.Scanner;

public class Codetown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String s = sc.next();
            String vow = "AEIOU";
            String dest = "CODETOWN";
            boolean flag = false;

            for (int i = 0; i < 8; i++) {
                if ((vow.indexOf(s.charAt(i)) != -1 && vow.indexOf(dest.charAt(i)) != -1) ||
                    (vow.indexOf(s.charAt(i)) == -1 && vow.indexOf(dest.charAt(i)) == -1)) {
                    continue;
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
