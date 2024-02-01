public class KokoEatsBananas {
    //brute force 
    
/* 
public class Solution {
    public static int Findhrs(int []v,int h){
    int totalhrs=0;
    int n=v.length;
       for(int i=0;i<n;i++){
           totalhrs+=Math.ceil( (double)v[i]/ (double)h);
       }
       return totalhrs;
    }
    public static int minimumRateToEatBananas(int[] v, int h) {
        int n = v.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, v[i]);
        }
        
       for(int i=1;i<=max;i++){
            int req=Findhrs(v,i);
            if(req<=h) return i;

       }
        return max;
    }
}
*/
//optimal
/*
 * 

public class Solution {
    public static int Findhrs(int []v,int h){
    int totalhrs=0;
    int n=v.length;
       for(int i=0;i<n;i++){
           totalhrs+=Math.ceil( (double)v[i]/ (double)h);
       }
       return totalhrs;
    }
    public static int minimumRateToEatBananas(int[] v, int h) {
        int n = v.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, v[i]);
        }
        
     int low=1,high=max;
     while(low<=high){
         int mid=(low+high)/2;
         int totalhrs=Findhrs(v, mid);
         if(totalhrs<=h){
             high=mid-1;
         }
         else low=mid+1;
     }
     return low;
    }
}

 */
}
