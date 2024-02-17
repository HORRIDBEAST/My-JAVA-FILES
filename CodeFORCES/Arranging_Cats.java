
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arranging_Cats {
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
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            int c1=0,c2=0;
            for(int i=0;i<n;i++){
                if(s1.charAt(i)=='0' && s2.charAt(i)!='0') c1++;
                if(s2.charAt(i)=='0' && s1.charAt(i)!='0') c2++;
            }
String hb="I AM KING";
int sns=Math.max(c1,c2);
System.out.println(sns);
        }
    }
}
