public class Solution {
    public static int search(int []nums, int target) {
       int n=nums.length;
       int low=0,high=n-1;
       int answer=-1;
           while(low<=high){
           int mid=(low+high)/2;
           if(nums[mid]==target){
               answer=mid;
               break;
           }
           else if(target>nums[mid])low=mid+1;
           else high=mid-1;
       }
       return answer;
       }
    }
//BS BY RECURSION
/*
 * 
 * public class Solution {
    public static int bs(int nums[],int low,int high,int target){
        int n=nums.length;
       int answer=-1;
           while(low<=high){
           int mid=(low+high)/2;
           if(nums[mid]==target){
               answer=mid;
               break;
           }
           else if(target>nums[mid])return bs(nums,mid+1,high,target);
           else return bs(nums,low,mid-1,target);
       }
       return answer;
    }
    public static int search(int []nums, int target) {
        int n=nums.length;
       return bs(nums,0,n-1,target);
       }
    }

 * 
 * 
 */