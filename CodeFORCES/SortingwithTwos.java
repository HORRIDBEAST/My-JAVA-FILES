import java.util.*;

public class SortingwithTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            String ans = "YES";
            for (int i = 0; i < n - 1; i++) {
                if ((i & (i + 1)) != 0) {
                    if (a[i] > a[i + 1]) {
                        ans = "NO";
                        break;
                    }
                }
            }
            System.out.println(ans); // Changed to System.out.println to print the result
        }
    }
}
