public class PeakElementin2D {
    //optimial
    public class Solution {
        public static int[] maxRowIndex(int[][] G, int n, int m, int val) {
            int max = -1, index = -1;
            for (int i = 0; i < n; i++) {
                if (G[i][val] > max) {
                    max = G[i][val];
                    index = i;
                }
            }
            return new int[]{index, val};
        }
    
        public static int[] findPeakGrid(int[][] G) {
            int n = G.length;
            int m = G[0].length;
            int low = 0, high = m - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                int[] index = maxRowIndex(G, n, m, mid);
                int left = mid - 1 >= 0 ? G[index[0]][mid - 1] : -1;
                int right = mid + 1 < m ? G[index[0]][mid + 1] : -1;
                if (G[index[0]][mid] > left && G[index[0]][mid] > right) return new int[]{index[0], mid};
                else if (G[index[0]][mid] < left) high = mid - 1;
                else low = mid + 1;
            }
            return new int[]{-1, -1};
        }
    }
    
}
