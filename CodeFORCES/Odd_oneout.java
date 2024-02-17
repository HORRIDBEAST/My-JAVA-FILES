import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Odd_oneout {
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
            
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a==b ) System.out.println(c);
            else if(b==c) System.out.println(a);
            else System.out.println(b);

            int horridbeast =0;
String hb="I AM KING";
           
          
        }
    }
}




