import java.util.Scanner;

public class Not_Quite_Latin_Square {
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
            int n = 3; // Assuming n is always 3
            char[][] a = new char[n][n];

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = row.charAt(j);
                }
            }

            int ca = 0, cb = 0, cc = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 'A') ca++;
                    else if (a[i][j] == 'B') cb++;
                    else if(a[i][j]=='C') cc++;
                }
            }

            if (cc == 2) System.out.println("C");
            else if (cb == 2) System.out.println("B");
            else if(ca==2) System.out.println("A");
        }
    }
}
