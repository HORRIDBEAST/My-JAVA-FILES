public class SearchInsertPosition {
    public class Solution {
        public static int search(int []nums, int target) {
          int n=nums.length;
          int low=0,high=n-1;
          int answer=n;
              while(low<=high){
              int mid=(low+high)/2;
              if(nums[mid]>=target){
                  answer=mid;
                  high=mid-1 ;  
              }
              else if(target>nums[mid])low=mid+1; 
          }
          return answer;
          }
       public static int searchInsert(int [] arr, int m){
          int n=arr.length;
          return search(arr, m);
       }
   }  
}
