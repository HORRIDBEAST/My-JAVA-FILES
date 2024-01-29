public class merge2sortedArrays{
    //brute force
    /*
     * import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        int na = a.length;
        int nb = b.length;
        int left = 0;
        int right = 0;
        int index = 0;
        long ans[] = new long[na + nb];

        while (left < na && right < nb) {
            if (a[left] < b[right]) {
                ans[index] = a[left];
                left++;
            } else {
                ans[index] = b[right];
                right++;
            }
            index++;
        }

        while (left < na) {
            ans[index++] = a[left++];
        }

        while (right < nb) {
            ans[index++] = b[right++];
        }

        for (int i = 0; i < na + nb; i++) {
            if (i < na) {
                a[i] = ans[i];
            } else {
                b[i - na] = ans[i];
            }
        }
    }
}

     */
}
//better solution
/*
 * import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        int n=a.length;
        int m=b.length;
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(a[left]>b[right]){
                long temp=a[left];
                a[left]=b[right];
                b[right]=temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        }
    }

 */