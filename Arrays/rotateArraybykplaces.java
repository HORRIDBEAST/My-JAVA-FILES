public class rotateArraybykplaces {
    //brute force
    /*
     class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
       if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
    int[] temp = new int[k];
    for (int i = n - k; i < n; i++) {
      temp[i - n + k] = nums[i];
    }
    for (int i = n - k - 1; i >= 0; i--) {
      nums[i + k] = nums[i];
    }
    for (int i = 0; i < k; i++) {
      nums[i] = temp[i];
    }
    for(int i=0;i<n;i++){
        System.out.print(nums[i]);
    }
        }
    }


     */

     //optmal
     class Solution {
    public void reverse(int nums[],int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
       if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
    reverse(nums,0,n-k-1);
    reverse(nums,n-k,n-1);
    reverse(nums,0,n-1);
    for(int i=0;i<n;i++){
        System.out.print(nums[i]);
    }
    }

        }
    


}
