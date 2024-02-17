
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Binary_Imbalance
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T-->0){
int n=sc.nextInt();
String str=sc.next();
int c0=0;
int c1=0;
for(int i=0;i<n;i++){
    if(str.charAt(i)=='0') c0++;
    else c1++;
}

if(c0>c1) System.out.println("YES");
else {
    if(c0==0) System.out.println("NO");
    else  System.out.println("YES");
}
	}
}
}
