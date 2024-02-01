public class LowerBound {
    //woithout binary earch-linear search
    /*
     * 
     * public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int answer=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>=x) {
                answer=Math.min(answer,i);
            }
            else answer=n;
        }
        return answer;
    }
}
     */

     //Binary Search
     /*
      * public class Solution {
    public static int lowerBound(int []arr, int x, int n){
       int answer=n;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                answer=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return answer;
    }
}

      */
}
