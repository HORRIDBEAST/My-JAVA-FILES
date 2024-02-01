public class SearchinroatedSortedArray2 {
    //brute force
/*
 * public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        int n=A.length;
       boolean asn=false;
       for(int i=0;i<n;i++){
           if(A[i]==key) asn=true;
       }
       return asn;
    }
}
 */
//optimal -same as the 1 but just including 1 ede case
public class Solution {
    public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
        int n = A.length;
        boolean asn = false;
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (A[mid] == key) {
                asn = true;
                break;
            }
            
            if (A[low] == A[mid] && A[mid] == A[high]) {
                low = low + 1;
                continue;  // Only increment 'low', not 'high'
            }
            
            // Left sorted
            if (A[low] <= A[mid]) {
                if (A[low] <= key && key <= A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Right sorted
            else {
                if (A[mid] <= key && key <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return asn;
    }
}

}
