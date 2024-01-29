import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class spiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int a[][]=new int[N][N];
        
        //calculating the transpose of the matrix
        int rmin=0,rmax=N-1,cmin=0,cmax=N-1;
        int m=a[0].length;
      int count = 0;
  int val = 1;
  while (cmin <= cmax && rmin <= rmax) {
      // top boundary
      for (int i = cmin; i <= cmax && count < N * N; i++) {
          a[rmin][i] = val++;
          // count++;
      }
      rmin++;
      // right boundary
      for (int i = rmin; i <= rmax && count < N * N; i++) {
          a[i][cmax] = val++;
          // count++;
      }
      cmax--;
      if (rmin <= rmax) {
          for (int i = cmax; i >= cmin && count < N * N; i--) {
              a[rmax][i] = val++;
              // count++;
          }
          rmax--;
      }
      if (cmin <= cmax) {
          for (int i = rmax; i >= rmin && count < N * N; i--) {
              a[i][cmin] = val++;
              // count++;
          }
          cmin++;
      }
  }
  for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
      System.out.println(a[i][j]);
    }
  }

    }
}

