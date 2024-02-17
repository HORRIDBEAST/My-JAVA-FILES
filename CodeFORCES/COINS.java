import java.util.*;
public class COINS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
         long n=sc.nextLong();
         long k=sc.nextLong();
         
         if(n%2==0 || (n-k)%2==0){
             System.out.println("YES");
             
         }
         else{
             System.out.println("NO");
         }
        }}}
