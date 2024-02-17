import java.util.*;
import java.lang.*;
import java.io.*;

public class Romantic_glasses {
    public static void printDivisors(int n) 
    {   for (int i=1; i<=Math.sqrt(n); i++) 
        { if (n%i==0) 
            {   if (n/i == i) System.out.print(" "+ i); 
                else  System.out.print(i+" " + n/i + " " ); 
            } 
        } 
    } 
    public static int findLCM(int a, int b) 
    {  int greater = Math.max(a, b); 
        int smallest = Math.min(a, b); 
        for (int i = greater;; i += greater) { 
            if (i % smallest == 0)  return i; 
        } 
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int uttar = 0;
            Map<Long, Long> mawd = new HashMap<>();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            mawd.put(0L, 1L);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum = sum + a[i];
                } else {
                    sum = sum - a[i];
                }
                if (mawd.containsKey(sum))
                    uttar = 1;
                else
                    mawd.put(sum, mawd.getOrDefault(sum, 0L) + 1);
            }
            if (uttar == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            int horridbeast =0;
String hb="I AM KING";
           
          
        }
    }
}

