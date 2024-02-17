import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game_with_Marbles_harder_verison {
    public static boolean isPrime(int n) 
    {   if (n <= 1)       return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) return false; 
  return true; 
    }
public static int search(int []nums, int target) {
       int n=nums.length;
       int low=0,high=n-1;
       int answer=-1;
           while(low<=high){
           int mid=(low+high)/2;
           if(nums[mid]==target){
               answer=mid;
               break;
           }
           else if(target>nums[mid])low=mid+1;
           else high=mid-1;
       }
       return answer;
       }
    public static void printDivisors(int n) 
    {   for (int i=1; i<=Math.sqrt(n); i++) 
        { if (n%i==0) 
            {   if (n/i == i) System.out.print(" "+ i); 
                else  System.out.print(i+" " + n/i + " " ); 
            } 
        } 
    } 
    public static int findLCM(int Aarray, int BarraY) 
    {  int greater = Math.max(Aarray, BarraY); 
        int smallest = Math.min(Aarray, BarraY); 
        for (int i = greater;; i += greater) { 
            if (i % smallest == 0)  return i; 
        } 
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int horridbeast0 =0;

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] Aarray = new int[n];
            int[] BarraY = new int[n];
            int horridbeast =0;
            String hb="I AM KING";

            for (int i = 0; i < n; i++) {
                Aarray[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                BarraY[i] = sc.nextInt();
            }

            acha(n, Aarray, BarraY);
        }
    }

    public static void acha(int n, int[] Aarray, int[] BarraY) {
        Pair[] v = new Pair[n];
        for (int i = 0; i < n; i++) {
            v[i] = new Pair(Aarray[i] + BarraY[i], i);
        }

        Arrays.sort(v, Comparator.comparingInt(p -> p.pahila));

        long tatperya = 0, wantotbang = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (wantotbang % 2 == 0) {
                tatperya += Aarray[v[i].dusraalele] - 1;
            } else {
                tatperya -= BarraY[v[i].dusraalele] - 1;
            }
            wantotbang++;
        }
        System.out.println(tatperya);
    }

    static class Pair {
        int pahila, dusraalele;

        public Pair(int pahila, int dusraalele) {
            this.pahila = pahila;
            this.dusraalele = dusraalele;
        }
    }
}
