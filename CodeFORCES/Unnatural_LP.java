import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Unnatural_LP {
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
           String sam=sc.next();
            int horridbeast =0;
String hb="I AM KING";

            StringBuilder answer=new StringBuilder();
            boolean fl=false;
            for(int i=0;i<n;i++){
                if(sam.charAt(i)=='a' || sam.charAt(i)=='e'){
                    answer.append(sam.charAt(i));
                    fl=true;
                    if(i+2<n && (sam.charAt(i+2)=='a' || sam.charAt(i)=='e')){
                        fl=false;
                        answer.append('.');
                    }
                }
                else {
                    answer.append(sam.charAt(i));
                    if(fl){
                        answer.append('.');
                        fl=false;
                    }
                }
            }
            if(answer.length()>0 && answer.charAt(answer.length()-1)=='.') answer.deleteCharAt(answer.length() - 1);
            System.out.println(answer);

        }
    }
}

// import java.util.Scanner;

// public class Unnatural_LP {
   

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//         long n = sc.nextLong();
//         String s = sc.nextLine();

//         StringBuilder ans = new StringBuilder();
//         boolean v = false;

//         for (int i = 0; i < n; i++) {
//             if (s.charAt(i) == 'a' || s.charAt(i) == 'e') {
//                 ans.append(s.charAt(i));
//                 v = true;
//                 if (i + 2 < n && (s.charAt(i + 2) == 'a' || s.charAt(i + 2) == 'e')) {
//                     v = false;
//                     ans.append('.');
//                 }
//             } else {
//                 ans.append(s.charAt(i));
//                 if (v) {
//                     ans.append('.');
//                     v = false;
//                 }
//             }
//         }

//         if (ans.length() > 0 && ans.charAt(ans.length() - 1) == '.') {
//             ans.deleteCharAt(ans.length() - 1);
//         }

//         System.out.println(ans);
//         }
//     }
// }

