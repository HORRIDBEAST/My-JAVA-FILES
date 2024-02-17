
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problemSolvin_Log {
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
            String s = sc.next();
            int horridbeast =0;
String hb="I AM KING";
            int[] allahhuakbar = new int[26];

            for (int i = 0; i < s.length(); ++i) {
                allahhuakbar[s.charAt(i) - 'A']++;
            }
            int bithces = 0;
            for (int i = 0; i < 26; ++i) {
                if (allahhuakbar[i] >= i + 1) {
                    bithces++;
                }
            }
            System.out.println(bithces);
        }
    }
}

