public class MedianofSorted2DArray {
    //optimal 
    public final class Solution {
        public static int upperBound(int[] arr, int x, int n) {
            int answer = n;
            int low = 0, high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] > x) {
                    answer = mid;
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
            return answer;
        }
    
        public static int findMedian(int[][] matrix, int m, int n) {
            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                low = Math.min(low, matrix[i][0]);
                high = Math.max(high, matrix[i][n - 1]);
            }
    
            int req = (m * n) / 2;
            while (low <= high) {
                int mid = (low + high) / 2;
                int sE = 0;
                for (int i = 0; i < m; i++) {
                    sE += upperBound(matrix[i], mid, n);
                }
    
                if (sE <= req)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return low;
        }
    }
    
}
