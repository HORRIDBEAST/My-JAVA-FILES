public class LargestSubarraySumminimised {
    //brute force
    /*
     * 
public class Solution {
    public static int Countsubarraysum(int a[],int pg,int n){
        int partitons=1;
        int subarraysum=0;
        for(int i=0;i<n;i++){
            if(a[i]+subarraysum<=pg){
                subarraysum+=a[i];
            }
            else{
                partitons++;
                subarraysum=a[i];
            }
        }
        return partitons;
    }
    public static int findSum(int a[],int k,int n){
        if(k>n) return -1;
        int min=a[0];
        int max=0;
        for(int i=0;i<n;i++){
            min=Math.max(min,a[i]);
            max+=a[i];
        }
        for(int i=min;i<=max;i++){
            if(Countsubarraysum(a,i,n)==k) return i;
        }
        return min;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        int n=a.length;
        return findSum(a, k , n);
    }
}




     */

     //optimal
     
public class Solution {
    public static int Countsubarraysum(int a[],int pg,int n){
        int partitons=1;
        int subarraysum=0;
        for(int i=0;i<n;i++){
            if(a[i]+subarraysum<=pg){
                subarraysum+=a[i];
            }
            else{
                partitons++;
                subarraysum=a[i];
            }
        }
        return partitons;
    }
    public static int findSum(int a[],int k,int n){
        if(k>n) return -1;
        int min=a[0];
        int max=0;
        for(int i=0;i<n;i++){
            min=Math.max(min,a[i]);
            max+=a[i];
        }
        int low=min, high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Countsubarraysum(a, mid, n)<=k){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        
        return low;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        int n=a.length;
        return findSum(a, k , n);
    }
}




}
