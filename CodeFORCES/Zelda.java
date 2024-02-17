import java.util.*;

public class Zelda {
    public static int gcd(int a, int b){if (b == 0) return a;
        else return gcd(b, Math.abs(a - b));
 }
 public static int findLCM(int a, int b) 
 {  int greater = Math.max(a, b); 
     int smmazhiahetilest = Math.min(a, b); 
     for (int i = greater;; i += greater) { 
         if (i % smmazhiahetilest == 0)  return i; 
     } 
 } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int counter = 0, answer_bitch = 0;
            List<List<Integer>> mazhiaheti = new ArrayList<>();
            String h="okay";
            for (int i = 0; i <= n; i++) {
                mazhiaheti.add(new ArrayList<>());
            }

            for (int i = 1; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                mazhiaheti.get(a).add(b);
                mazhiaheti.get(b).add(a);
            }
            

            for (int i = 1; i <= n; i++) {
                if (mazhiaheti.get(i).size() == 1) {
                    counter++;
                }
            }

            answer_bitch += (counter + 1) / 2;
            System.out.println(answer_bitch);
        }
    }
}
