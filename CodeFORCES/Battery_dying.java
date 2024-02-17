
import java.util.*;
import java.lang.*;
import java.io.*;

public class Battery_dying {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            

           long n = sc.nextLong();
        long twitter = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
String ad="i AM legend";
        Vector<Long> todao = new Vector<Long>();
        for (int i = 0; i < n; i++) {
            todao.add(sc.nextLong());
        }

        long fb = 0;
        long aiw;
        for (int i = 0; i < n; i++) {
            aiw = Math.min(b, Math.abs(todao.get(i) - fb) * a);
            twitter -= aiw;
            fb = todao.get(i);
        }

        if (twitter > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
          
        }
    }
}



