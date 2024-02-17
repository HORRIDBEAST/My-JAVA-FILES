// import java.util.*;
// import java.lang.*;
// import java.io.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// public class Can_I_Square {
//     public static void printDivisors(int n) 
//     {   for (int i=1; i<=Math.sqrt(n); i++) 
//         { if (n%i==0) 
//             {   if (n/i == i) System.out.print(" "+ i); 
//                 else  System.out.print(i+" " + n/i + " " ); 
//             } 
//         } 
//     } 
//     public static int findLCM(int a, int b) 
//     {  int greater = Math.max(a, b); 
//         int smallest = Math.min(a, b); 
//         for (int i = greater;; i += greater) { 
//             if (i % smallest == 0)  return i; 
//         } 
//     } 
//     public static boolean isPerfectSquare(int num) {
//         if (num < 0) {
//             return false;  // Negative numbers are not perfect squares
//         }

//         int sqrt = (int) Math.sqrt(num);
//         return sqrt * sqrt == num;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int a[]=new int[n];
//             int sum=0;
//            for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//            }
//             for(int i=0;i<n;i++){
//             sum+=a[i];
//            }
//             if (isPerfectSquare(sum)) System.out.println("YES");
//             else System.out.println("NO");
//             int horridbeast =0;
// String hb="I AM KING";
           
//         }
//     }
// }



import java.util.*;

public class Can_I_Square {
    static long sq(long val) {
        long lo = 1;
        long hi = 1000000001;

        while (hi - lo > 1) {
            long mid = (lo + hi) / 2;

            if (mid * mid == val) {
                return mid;
            } else if (mid * mid < val) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        if (lo * lo == val) {
            return lo;
        } else if (hi * hi == val) {
            return hi;
        }
        return -1;
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long el = sc.nextLong();
            a.add(el);
        }

        long sum = 0;
        for (long el : a) {
            sum += el;
        }

        if (sq(sum) != -1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
