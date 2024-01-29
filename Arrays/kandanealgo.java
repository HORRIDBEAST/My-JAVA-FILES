public class kandanealgo {
    //brute force-O(n3)
    import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
        long ans=0;
		for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                ans=Math.max(sum, ans);
            }
        }
        return ans;

	}

}
//brute force 2 -O(N2)
import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
        long ans=0;
		for(int i=0;i<n;i++){
              long sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
            ans=Math.max(sum,ans);
        }
        
	}
return ans;
}}
//using most optimal
import java.util.* ;
import java.io.*; 

public class Solution {
	public static long maxSubarraySum(int[] arr, int n) {
	long ans=Long.MIN_VALUE;
    long sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum<0) sum=0;
        ans=Math.max(sum,ans);
    }
    return ans;
	}
}

}
