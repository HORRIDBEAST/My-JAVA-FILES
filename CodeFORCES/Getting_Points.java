import java.util.Scanner;

public class Getting_Points {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextInt();
            long P = sc.nextInt();
            long l = sc.nextInt();
            long t = sc.nextInt();
            long not =(long) Math.ceil(N/7);
            long total = not * t + N * l;
            if (not > 2) {
                if (P < total) {
                    long workp = (2 * t + l);
                    long w =0;
                    if((P%workp)!=0) w=1+(P/workp);
                    else w=(P/workp);
                    long ans = N - w;
                    System.out.println(ans);
                } else {
                    System.out.println(0);
                }
            } else {
                if (P < total) {
                    System.out.println(N -(long) Math.ceil(P / total));
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
/*
import java.util.*;
 
public class faltu {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int tc = sc.nextInt();
  while (tc-- > 0) {
   long n = sc.nextLong();
   long p = sc.nextLong();
   long l = sc.nextLong(), t = sc.nextLong();
   long nt = 1 + (n - 1) / 7;
   long ans = 0;
   long kk = 0;
   if (p % (l + t * 2) != 0) {
    kk = (p / (l + t * 2)) + 1;
   }
   ans += (long) Math.min(nt / 2, (long) Math.max(kk, (p / (l + t * 2))));
   p -= ans * (l + t * 2);
   if (nt % 2 == 1 && p > 0) {
    ans++;
    p -= (l + t);
   }
 
   ans += (long) Math.max(0, p) / l;
   if ((long) Math.max(0, p) % l != 0)
    ans++;
   System.out.println(n - ans);
 
  }
 }
}