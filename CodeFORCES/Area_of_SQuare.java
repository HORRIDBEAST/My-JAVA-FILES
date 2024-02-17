
    
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Area_of_SQuare {
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
           int a1=sc.nextInt();
           int a2=sc.nextInt();
           int b1=sc.nextInt();
           int b2=sc.nextInt();
           int c1=sc.nextInt();
           int c2=sc.nextInt();
           int d1=sc.nextInt();
           int d2=sc.nextInt();

           int k1=Math.min(a1,b1);
           int k2=Math.min(c1,d1);
           int len=Math.min(k1,k2);

           int x1=Math.max(a2,b2);
           int x2=Math.max(c2,d2);
           int bre=Math.max(x1,x2);

           int y1=Math.max(a1,b1);
           int y2=Math.max(c1,d1);
           int len2=Math.max(y1,y2);

           int z1=Math.min(a2,b2);
           int z2=Math.min(c2,d2);
           int bre2=Math.min(z1,z2);
           
           int ans=(len2-len)*(bre-bre2);
           System.out.println(ans);
String hb="I AM KING";
          
        }
    }
}

