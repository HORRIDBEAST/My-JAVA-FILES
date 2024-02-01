public class MinimuminsortedrotatedArray {
    //brute force
    /*
     * public class Solution {
    public static int findMin(int []arr) {
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(arr[i],ans);
        }
        return ans;
    }

}
     */



    //optimal
    /*
     * public class Solution {
    public static int findMin(int []arr) {
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }

}
     */
    //more  optimal
    public class Solution {
        public static int findMin(int []arr) {
            int n=arr.length;
            int ans=Integer.MAX_VALUE;
            int low=0,high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[low]<=arr[high]){
                    ans=Math.min(arr[low],ans);
                    break;
                }
                if(arr[low]<=arr[mid]){
                    ans=Math.min(ans,arr[low]);
                    low=mid+1;
                }
                else{
                    ans=Math.min(ans,arr[mid]);
                    high=mid-1;
                }
            }
            return ans;
        }
    
    }   
}
