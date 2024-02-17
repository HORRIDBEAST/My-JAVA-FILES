import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            Vector<Integer> horridl = new Vector<>();
            Vector<Integer> horridu = new Vector<>();
            String la = "qwertyuiopasdfghjklzxcvbnm";
            String ua = "QWERTYUIOPASDFGHJKLZXCVBNM";
            ArrayList<Character> a = new ArrayList<>();
            StringBuilder answer = new StringBuilder();
            int c = 0;

            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) == 'B' && horridu.size() > 0) {
                    a.set(horridu.get(horridu.size() - 1), '_');
                    horridu.remove(horridu.size() - 1);
                } else if (str.charAt(i) == 'b' && horridl.size() > 0) {
                    a.set(horridl.get(horridl.size() - 1), '_');
                    horridl.remove(horridl.size() - 1);
                } else if (str.charAt(i) != 'b' && str.charAt(i) != 'B') {
                    if (la.indexOf(str.charAt(i)) != -1)
                        horridl.add(c);
                    else
                        horridu.add(c);
                    a.add(str.charAt(i));
                    c++;
                }
            }

            for (char i : a) {
                if (i != '_')
                    answer.append(i);
            }

            System.out.println(answer.toString());
        }
    }
}

