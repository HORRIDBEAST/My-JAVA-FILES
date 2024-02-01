public class RoweithmaximumOnes {
    //brute force
    /*
     * import java.util.ArrayList;

public class Solution {
    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int cnt_max = 0;
        int index = -1;

        // traverse the matrix:
        for (int i = 0; i < n; i++) {
            int cnt_ones = 0;
            for (int j = 0; j < m; j++) {
                cnt_ones += mat.get(i).get(j);
            }
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }
}

     */
    //optimal solution
    import java.util.ArrayList;

public class Solution {

    public static int lowerBound(ArrayList<Integer> arr, int x,int n) {
        int answer = n;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= x) {
                answer = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return answer;
    }

    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int cnt_max = 0;
        int asn = -1;
        for (int i = 0; i < n; i++) {
            int ones = m - lowerBound(mat.get(i), 1,m);
            if (ones > cnt_max) {
                cnt_max = ones;
                asn = i;
            }
        }
        return asn;
    }
}

}
