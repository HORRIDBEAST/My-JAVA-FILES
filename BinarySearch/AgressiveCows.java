public class AgressiveCows {
    //brute force 
    /*
     * import java.util.*;
public class Solution {
    public static boolean Canweplace(int a[],int index,int number,int n){
        int cows=1;
        int earlier=a[0];
        for(int i=1;i<n;i++){
            if(a[i]-earlier>=index){
                cows++;
                earlier=a[i];
            }
            if(cows>=number) return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        int n=stalls.length;
        Arrays.sort(stalls);
        
        int lim=stalls[n-1]-stalls[0];
        for(int i=1;i<=lim;i++){
            if(Canweplace(stalls,i,k,n)==false) return i-1;
        }
        return lim;
    }
}
//optimal solution -binary search
import java.util.*;
public class Solution {
    public static boolean Canweplace(int a[],int index,int number,int n){
        int cows=1;
        int earlier=a[0];
        for(int i=1;i<n;i++){
            if(a[i]-earlier>=index){
                cows++;
                earlier=a[i];
            }
            if(cows>=number) return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        int n=stalls.length;
        Arrays.sort(stalls);
        
        int lim=stalls[n-1]-stalls[0];
        int low=1,high=lim;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Canweplace(stalls,mid,k,n)==false) high=mid-1;
            else {
                ans=mid;
            low=mid+1;
            }
        }
        return ans;
    }
}
     */
    
}
