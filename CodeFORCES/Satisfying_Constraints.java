import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Satisfying_Constraints {
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
            int Start=Integer.MIN_VALUE;
            int End=Integer.MAX_VALUE;
            int not=0;
            int n = sc.nextInt();
            HashSet<Integer> s=new HashSet<>();
           for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int x=sc.nextInt();
            if(a==1) Start=Math.max(Start,x);
            else if(a==2) End=Math.min(End,x);
            else s.add(x);
           }
           int an=End-Start+1;
           int cnt=0;
           for(int i=Start;i<=End;i++){
            if(i!=not) cnt++;
           }
        }
          System.out.println(cnt);
        }
    }
/*
 * import java.util.*;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
 
        while (tt-- > 0) {
            int n = scanner.nextInt();
 
            int lowerBound = 0;
            int upperBound = 1000000000; 
 
            Set<Integer> set = new TreeSet<>();
 
            for (int i = 0; i < n; i++) {
                int operation = scanner.nextInt();
                int value = scanner.nextInt();
 
                if (operation == 1) {
                    lowerBound = Math.max(lowerBound, value);
                } else if (operation == 2) {
                    upperBound = Math.min(upperBound, value);
                } else {
                    set.add(value);
                }
            }
 
            int answer = upperBound - lowerBound + 1;
        
 
            for (int val : set) {
                if (lowerBound <= val && val <= upperBound) {
                    answer =answer - 1;
                    
                }
            }
 
            System.out.println(answer > 0 ? answer : 0); 
 
            set.clear();
        }
    }
}
 */

