public class CountOccurences {
    //brute force
    /*
     public class Solution {
    public static int count(int arr[], int n, int x) {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x) count++;
        }
        return count;
    }
}
     */
}
//optimal
/*
 * public class Solution {
    public static int first(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int f = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                f = mid;
                high = mid - 1;
            } else if (arr[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return f;
    }

    public static int last(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int l =-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                l = mid;
                low = mid + 1;
            } else if (arr[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return l;
    }
    public static int[] firstandLAST(int arr[],int n,int k){
        int fr=first(arr, n, k);
        if(fr==-1) return new int[] {-1,-1};
        int ls=last(arr, n, k);
        int answer[]={fr,ls};
        return answer;
    }

    public static int count(int[] arr, int n, int x) {
        int asn[]=firstandLAST(arr, n, x);
        if(asn[0]==-1) return 0;
        int count = asn[1] - asn[0] + 1;
        return count;
    }
}

 */