
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quests {
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
            int k= sc.nextInt();
            int horridbeast =0;
String hb="I AM KING";
int[] a = new int[n];
int[] b = new int[n];

for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
}

for (int i = 0; i < n; i++) {
    b[i] = sc.nextInt();
}

int bithces = 0;
int fbithces = 0;
int man = 0;

for (int j = 0; j < n; j++) {
    if (k == j) {
        break;
    }

    bithces += a[j];
    man = Math.max(man, b[j]);
    fbithces = Math.max(bithces + (k - j - 1) * man, fbithces);
}

System.out.println(fbithces);
           
          
        }
    }
}



