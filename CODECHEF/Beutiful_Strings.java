
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulStrings {
    static final long Given = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; ++k) {
            int m = sc.nextInt();
            String t = sc.next();

            Map<Character, Integer> freq = new HashMap<>();
            for (char i : t.toCharArray()) {
                freq.put(i, freq.getOrDefault(i, 0) + 1);
            }

            long hb = 1;
            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                hb = (entry.getValue() + 1) * hb % Given;
            }

            hb = (hb - 1 + Given) % Given;
            System.out.println(hb);
        }
    }
}
