public class MaximumProductSubarray {
    //brute force
    /*
     * public class Solution {
    public static int subarrayWithMaxProduct(int []arr){
        int n=arr.length;
        long ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long prof=1;
                for(int k=i;k<=j;k++){
                    prof*=arr[k];
                }
                ans=Math.max(ans,prof);
            }  
        }
        return (int) ans;
    }
}
     */
 //better 1- 2 loops
 /*
 public class Solution {
    public static int subarrayWithMaxProduct(int []arr){
        int n=arr.length;
        long ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            long prof=1;
            for(int j=i;j<n;j++){
                prof*=arr[j];
                ans=Math.max(ans,prof);
            }  
        }
        return (int) ans;
    }
} */   
//better 2 - hashing
}
