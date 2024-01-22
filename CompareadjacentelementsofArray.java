/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CompareadjacentelementsofArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		    int N=sc.nextInt();
		    int a[]=new int [N];
		    for(int i=0;i<N;i++){
		        a[i]=sc.nextInt();
		    }
		    int c=0;
		    for(int i=0;i<N-1;i++){
		        if(a[i]==a[i+1]){
		            c++;
		        }
		    }
            System.out.println("Number of the adjaenct same elements is "+c);  
		       
}}
