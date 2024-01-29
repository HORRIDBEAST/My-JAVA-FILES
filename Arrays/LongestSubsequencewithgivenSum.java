public class LongestSubsequencewithgivenSum {
    //brute force - suing 3 loops
    //better solution - using 2 loops 
    //most optimal - using 2 pointers
    
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
    int n=arr.length;
    int count=0;
   int left=0,right=0;
   int sum=arr[0];
   while(right<n){
       while(left<=right && sum>s){
           sum-=arr[left];
           left++;
       }
       if(sum==s) count++;
       
       right++;
       if(right<n) sum+=arr[right];
   }
         return count;    
    }
}
}
