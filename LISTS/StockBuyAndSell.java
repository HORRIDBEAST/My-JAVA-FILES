public class StockBuyAndSell {
    //brute force-gives tle
    /*
     * import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int n=prices.size();
        int ans=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                if(prices.get(j)>prices.get(i)){
                    sum=prices.get(j)-prices.get(i);
                 ans=Math.max(ans,sum);
                }
            }       
             }
             return ans;
    }
}
     */

     //most optimal 
     import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int n=prices.size();
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           min=Math.min(prices.get(i),min);
           ans=Math.max(ans,prices.get(i)-min );
             }
             return ans;
    }
}
}
