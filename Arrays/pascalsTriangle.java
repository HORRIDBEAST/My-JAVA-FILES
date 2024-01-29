public class pascalsTriangle {
    //brute force 
    import java.util.*;
public class Solution {
    public static int Ncr(int N, int r) {
    long result = 1;
    for (int i = 1; i <= r; i++) {
        result = result * (N - i + 1);
        result = result / i;
    }
    return (int) result;
}
    
public static int[][] pascalTriangle(int N) {
    int[][] a = new int[N][];
    for (int i = 0; i < N; i++) {
        a[i] = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            a[i][j] = Ncr(i, j);
        }
    }
    return a;
}

}
//optmial
import java.util.*;

public class Solution {
    public static int[] generateRow(int r) {
        int result = 1;
        int[] a = new int[r];
        a[0] = 1;
        for (int i = 1; i < r; i++) {
            result = result * (r - i);
            result = result / i;
            a[i] = result;
        }
        return a;
    }
    public static int[][] pascalTriangle(int N) {
        int[][] a = new int[N][];
        for (int i = 0; i < N; i++) {
            a[i] = generateRow(i + 1);
        }
        return a;
    }
}


}
