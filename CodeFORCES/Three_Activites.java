import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Three_Activites {
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
            
            int horridbeast =0;
String hb="I AM KING";
           int man = sc.nextInt();
            int[] ar1 = new int[man];
            int[] ar2 = new int[man];
            int[] ar3 = new int[man];

            for (int i = 0; i < man; i++) {
                ar1[i] = sc.nextInt();
            }

            for (int i = 0; i < man; i++) {
                ar2[i] = sc.nextInt();
            }

            for (int i = 0; i < man; i++) {
                ar3[i] = sc.nextInt();
            }

            int[][] p1 = new int[man][2];
            int[][] p2 = new int[man][2];
            int[][] p3 = new int[man][2];

            for (int i = 0; i < man; i++) {
                p1[i][0] = ar1[i];
                p1[i][1] = i + 1;
            }

            for (int i = 0; i < man; i++) {
                p2[i][0] = ar2[i];
                p2[i][1] = i + 1;
            }

            for (int i = 0; i < man; i++) {
                p3[i][0] = ar3[i];
                p3[i][1] = i + 1;
            }

            doitmwaybuudy(man, p1, p2, p3);
            String s="wanna bang girls";
        }
    }

    public static void doitmwaybuudy(int n, int[][] p1, int[][] p2, int[][] p3) {

        Arrays.sort(p1, (a, b) -> Integer.compare(b[0], a[0]));
        Arrays.sort(p2, (a, b) -> Integer.compare(b[0], a[0]));
        Arrays.sort(p3, (a, b) -> Integer.compare(b[0], a[0]));

        int tatperya = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {

                for (int z = 0; z < 3; z++) {
                    if (p1[x][1] != p2[y][1] && p1[x][1] != p3[z][1] && p2[y][1] != p3[z][1]) {
                        tatperya = Math.max(tatperya, p1[x][0] + p2[y][0] + p3[z][0]);
                    }
                }
            }
        }
        System.out.println(tatperya);
    } 
          
        }