import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class spiralMatrix {
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
      int rmin=0,rmax=N-1,cmin=0,cmax=N-1;
      int m=a[0].length;
      int count=0;
      while(count<N*m){
        //top boundary
        for(int i=cmin;i<=cmax && count<N*m;i++){
            System.out.print(a[rmin][i]+" ");
            count++;
        }
        rmin++;
        //right boundary
         for(int i=rmin;i<=rmax  && count<N*m;i++){
            System.out.print(a[i][cmax]+" ");
            count++;
        }
        cmax--;
         for(int i=cmax;i>=cmin  && count<N*m;i--){
            System.out.print(a[rmax][i]+" ");
            count++;
        }
        rmax--;
         for(int i=rmax;i>=rmin  && count<N*m;i--){
            System.out.print(a[i][cmin]+" ");
            count++;
        }
        cmin++;
      }


    }
}

