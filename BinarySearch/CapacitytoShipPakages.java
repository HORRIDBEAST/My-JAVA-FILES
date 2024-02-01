public class CapacitytoShipPakages {
    //brute force 
    /*
     * import java.util.* ;
import java.io.*; 
public class Solution {
    public static int finddays(int index,int weights[]){
        int days=1;
        int load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(load+weights[i]>index){
                days++;
                load=weights[i];
            }
            else load+=weights[i];
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(weights[i],max);
        }
    
        for(int i=max;i<=sum;i++){
            if(finddays(i,weights)<=d) return i;
        }
        return -1;
    }
}
     */
    //optimal
    import java.util.* ;
import java.io.*; 
public class Solution {
    public static int finddays(int index,int weights[]){
        int days=1;
        int load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(load+weights[i]>index){
                days++;
                load=weights[i];
            }
            else load+=weights[i];
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(weights[i],max);
        }
        int low=max,high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(finddays(mid, weights)<=d){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
        // for(int i=max;i<=sum;i++){
        //     if(finddays(i,weights)<=d) return i;
        // }
        
    }
}
    
}
