
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class exe1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T-->0){
    int m=sc.nextInt();
    int s=sc.nextInt();
    int a[]=new int[m];
    int sum2=0;
    for(int i=0;i<m;i++){
        a[i]=sc.nextInt();
        sum2+=a[i];
    }
    int sum=0;
    boolean flag=false;
    for(int i=0;i<=m+s;i++){
        sum+=i;
        if(sum-sum2==s) {
            flag=true;
            break;
        }
        else continue;
    }
    if(flag==false ) System.out.println("NO");
    else System.out.println("YES");
}
    }
}
