public class subarrayswithgivenxorvalue {
    //better than 3 loops 
    /*
     * public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
      int n=a.length;
      int count=0;
      for(int i=0;i<n;i++){
          long xor=0;
          for(int j=i;j<n;j++){
               xor^=a[j];
                if (xor==b) count++;
          }
      }
      return count;
    }
}
     */
    //most optimal
   /*  import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
      int n=a.length;
      int count=0;
      long xor=0;
     Map<Long,Integer> mp=new HashMap<>();
     mp.put(xor,1);
     for(int i=0;i<n;i++){
         xor^=a[i];
         long x=xor^b;

         if(mp.containsKey(x)){
             count+=mp.get(x);
         }
         if(mp.containsKey(xor)){
             mp.put(xor,mp.get(xor)+1);
         }
         else{
             mp.put(xor,1);
         }
     }
      return count;
    }
}
*/
/*

}
