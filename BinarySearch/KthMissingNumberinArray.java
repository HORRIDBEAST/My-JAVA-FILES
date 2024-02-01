public class KthMissingNumberinArray {
    //brute force 
    /*
     * public class Solution {
    public static int missingK(int[] vec, int n, int k) {
      for(int i=0;i<n;i++){
          if(vec[i]<=k) k++;
      }
      return k;
    }
}
//optimal soltuion
public class Solution {
    public static int missingK(int[] vec, int n, int k) {
      int max=Integer.MIN_VALUE;
      int low=0,high=n-1;
      while(low<=high){
          int mid=(low+high)/2;
          int ms=vec[mid]-mid-1;
          if(ms<k)low=mid+1;
          else high=mid-1;
      }
      return k+low;
      }
    }


     */
    
}
