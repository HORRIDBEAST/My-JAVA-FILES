import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Removal_of_Unattractive_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> d = new HashMap<>();

            for (char i : s.toCharArray()) {
                d.put(i, d.getOrDefault(i, 0) + 1);
            }

            PriorityQueue<Integer> a = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

            for (int value : d.values()) {
                a.offer(-value);
            }

            while (a.size() > 1) {
                int q1 = Math.abs(a.poll());
                int q2 = Math.abs(a.poll());

                q1 -= 1;
                q2 -= 1;

                if (q1 > 0) {
                    a.offer(-q1);
                }

                if (q2 > 0) {
                    a.offer(-q2);
                }
            }

            int ans = 0;
            for (int i : a) {
                ans += Math.abs(i);
            }

            System.out.println(ans);
        }
    }
}



