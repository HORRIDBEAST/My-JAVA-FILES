import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Tricky_Templeate {
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
            String s1=sc.next();
            String s2=sc.next();
            String s3=sc.next(); 
             boolean  flag= false;
            for(int i=0;i<n;i++){
                if(s1.charAt(i)!=s3.charAt(i) && (s2.charAt(i)!=s3.charAt(i))  ) flag=true;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
          
        }
    }
}
 