public class CeilTheFloor {
    //swataha  kelay mi 
    /*\
     * 
     * 
     * 
     * import java.util.* ;
import java.io.*; 

public class Solution {
  public static int floor(int []nums, int target) {
       int n=nums.length;
       int low=0,high=n-1;
       int answer=-1;
           while(low<=high){
           int mid=(low+high)/2;
           if(nums[mid]<=target){
               answer=nums[mid];
               low=mid+1 ;  
           }
           else if(target<nums[mid])high=mid-1; 
       }
       return answer;
       }

    public static int ceil(int []nums, int target) {
       int n=nums.length;
       int low=0,high=n-1;
       int answer=-1;
           while(low<=high){
           int mid=(low+high)/2;
           if(nums[mid]>=target){
               answer=nums[mid];
               high=mid-1 ;  
           }
           else if(target>nums[mid])low=mid+1; 
       }
       return answer;
       }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
     int f= floor(a,x);
     int c= ceil(a,x);
     int ans[]={f,c};
     return ans;
    }
    
}
     */
}
