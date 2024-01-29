import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class rotateMatrixby90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int a[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                {
                        a[i][j]=sc.nextInt();
                    }  
                      }
        //calculating the transpose of the matrix
        for(int i=0;i<N;i++){
            for(int j=0;j<i+1;j++){
               //swap a[i][j] with a[j][i];
               int t=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=t;
            }
        }
        //swap the first and the last columns , 2 and the seconf last coulumns as so on
           int left=0,right=N-1;
        while(left<right){
            for(int i=0;i<N;i++){
                int temp=a[i][left];
                a[i][left]=a[i][right];
                a[i][right]=temp;
            }
            left++;
            right--;

        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
System.out.print(a[i][j]+" ");

}
System.out.println();  
      }

    }
}
//most optimal
class Solution {
    public void rotate(int[][] matrix) { 
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t;
                t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t;
                t=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-j-1]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
//brute force
class Solution {
    public void rotate(int[][] matrix) { 
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " "); // Added space for formatting
            }
            System.out.println();
        }
    }
}
