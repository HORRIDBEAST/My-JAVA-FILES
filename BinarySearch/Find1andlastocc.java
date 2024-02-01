public class Find1andlastocc {
    //brute force -mi kela
    /*
     * import java.util.ArrayList;
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
         int first = -1;
        int last = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == k) {
                count++;
                if (count == 1) {
                    first = i;
                    last=i;
                } else {
                    last = i;
                }
            }
        }
         if (count == 0) {
            first = -1;
            last = -1;
        }

        int[] ans = { first, last };
        return ans;
    }

};
/*
public class Solution {

           public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
       

        // If the element is not present, set both first and last to -1
       
    }


};*/

//brute force - easier - given solution
/*
 * public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == k) {
                if (first == -1) first = i;
                last = i;
            }
        }
        return new int[] {first, last};
    }
 */
}
//optimal -Lowera nd upper Bound
/*
 * import java.util.*;

public class Solution {
    public static int lower(ArrayList<Integer> arr, int x, int n) {
        int answer = n;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= x) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    public static int upper(ArrayList<Integer> arr, int x, int n) {
        int answer = n;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer - 1;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = lower(arr, k, n);
        int last = upper(arr, k, n);
        if (first == n || arr.get(first) != k)
            return new int[] { -1, -1 };
        int ans[] = { first, last };
        return ans;
    }
}

 * 
 */