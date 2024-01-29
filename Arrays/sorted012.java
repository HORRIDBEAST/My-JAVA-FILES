public class sorted012 {
    //brute force
    /*
     class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a[]=new int[n];
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) c0++;
            if (nums[i] == 1) c1++;
            if (nums[i] == 2) c2++;
        }

        for (int i = 0; i < c0; i++) nums[i] =0; // replacing 0's

        for (int i = c0; i < c0 + c1; i++) nums[i] =1; // replacing 1's

        for (int i = c0 + c1; i < n; i++) nums[i] =2; // replacing 2'
            for (int i = 0; i < n; i++) {
            System.out.print(nums[i] );
        }

    }
}
     */

    //most optimal
    class Solution {
        public void sortColors(int[] nums) {
           int n=nums.length;
           int low=0,mid=0,high=n-1;
           while(mid<=high){
               if(nums[mid]==0){
                   int temp=nums[low];
                   nums[low]=nums[mid];
                   nums[mid]=temp;
                   low++;
                   mid++;
               }
               else if(nums[mid]==1) mid++;
               else {
                   int temp=nums[mid];
                   nums[mid]=nums[high];
                   nums[high]=temp;
                   high--;
               }
           } 
           for(int i=0;i<n;i++){
               System.out.print(nums[i]);
           }
    
        }
    }
}
