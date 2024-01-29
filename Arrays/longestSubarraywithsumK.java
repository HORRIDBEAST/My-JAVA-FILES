public class longestSubarraywithsumK {
    //BRUTE FORCE 1 -O(more than n2)
    public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n=a.length;
        int len=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=0;
                for(int l=i;l<=j;l++){
                    sum+=a[l];
                }
                if(sum==k) len=Math.max(len,j-i+1);
            }
        }
        return len;
    }
}


    //BRUTE FORCE 2 - O(N2)
    public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n=a.length;
        int len=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(sum==k) len=Math.max(len,j-i+1);
            }
        }
        return len;
    }
}

//using hashmap , works for both positves and negatives as well
import java.util.HashMap;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n=a.length;
        int len=Integer.MIN_VALUE;
       HashMap<Long,Integer> preSum=new HashMap<>();
       long sum=0;
       for(int i=0;i<n;i++){
           sum+=a[i];

           if(sum==k) len=Math.max(len, i+1);
           long rem= sum-k;
           if(preSum.containsKey(rem)){
               int l=i-preSum.get(rem);
               len=Math.max(len, l);
           }
            if(!preSum.containsKey(sum)){
               preSum.put(sum,i);
           }
       }
        return len;
    }
}
}


//two pointer approach
import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n=a.length;
        int len=0;
        long sum=a[0];
      int left=0,right=0;
      while(right<n){
          while(sum>k && left<=right ){
              sum-=a[left];
              left++;
          }
          if(sum==k){
              len=Math.max(len, right-left+1);
          }
          right++;
          if(right<n) sum+=a[right];

      }
        return len;
    }
}