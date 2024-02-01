public class Kthelemntof2SortedArrays {
    //brute force - mi kelay
    /*
     * import java.util.ArrayList;

public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your code here
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0, j = 0;
        int c1 = 0, c2 = 0;

        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                l.add(arr1.get(i++));
                c1++;
            } else {
                l.add(arr2.get(j++));
                c2++;
            }
            if (c1 + c2 == k) {
                return l.get(k - 1);
            }
        }

        while (i < n) {
            l.add(arr1.get(i++));
            c1++;
            if (c1 + c2 == k) {
                return l.get(k - 1);
            }
        }

        while (j < m) {
            l.add(arr2.get(j++));
            c2++;
            if (c1 + c2 == k) {
                return l.get(k - 1);
            }
        }

        return -1; // Return -1 if k is out of bounds
    }
}

     */
    //best -binary search
    import java.util.ArrayList;

public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        if (n > m) {
            return kthElement(arr2, arr1, m, n, k);
        }

        int low = Math.max(0, k - m), high = Math.min(k, n);
        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = k - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1.get(cut1 - 1);
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2.get(cut2 - 1);

            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1.get(cut1);
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr2.get(cut2);

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return -1; // Return -1 if k is out of bounds
    }
}

}
