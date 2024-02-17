import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Form_triangles {
    public static void printDivisors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    System.out.print(" " + i);
                else
                    System.out.print(i + " " + n / i + " ");
            }
        }
    }
    static final int modi = 998244353;

    static long cc(int n) {
        return (n * (n - 1) * (n - 2)) / 6;
    }

    static long cd(int n) {
        return (n * (n - 1)) / 2;
    }
    public static int findLCM(int a, int b) {
        int greater = Math.max(a, b);
        int smallest = Math.min(a, b);
        for (int i = greater;; i += greater) {
            if (i % smallest == 0)
                return i;
        }
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long calculateBinomialCoefficient(int n, int x) {
        if (x < 0 || x > n) {
            return 0;
        }
        long result = factorial(n) / (factorial(x) * factorial(n - x));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String hb="I AM LEGEND";
            Vector<Integer> aaha = new Vector<>(n + 1);
        
        for (int i = 0; i <= n; i++) {
            aaha.add(0);
        }

        for (int i = 0; i < n; i++) {
            int va = sc.nextInt();
            aaha.set(va, aaha.get(va) + 1);
        }

        int ansefskef = 0;
        int prevanaw = 0;

        for (int i = 0; i <= n; i++) {
            if (aaha.get(i) >= 3) {
                ansefskef += cc(aaha.get(i));
            }
            if (aaha.get(i) >= 2) {
                ansefskef += cd(aaha.get(i)) * prevanaw;
            }

            prevanaw += aaha.get(i);
        }

        System.out.println(ansefskef);
    }
    }
}
