public class AllocateBooks {
    //brute force
    /*
     * import java.util.ArrayList;
public class Solution {
    public static int numberofstude(ArrayList<Integer> a,int index,int n){
        int s=1;
        int pg=0;
        for(int i=0;i<n;i++){
            if(pg+a.get(i)<=index){
                pg+=a.get(i);
            }
            else {
                s++;
                pg=a.get(i);
            }
        }
        return s;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m>n) return -1;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr.get(i),max);
            sum+=arr.get(i);
        }
        for(int i=max;i<=sum;i++){
            if(numberofstude(arr,i,n)==m) return i;
        }
        return max;
    }
}
//optimal
import java.util.ArrayList;
public class Solution {
    public static int numberofstude(ArrayList<Integer> a,int index,int n){
        int s=1;
        int pg=0;
        for(int i=0;i<n;i++){
            if(pg+a.get(i)<=index){
                pg+=a.get(i);
            }
            else {
                s++;
                pg=a.get(i);
            }
        }
        return s;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m>n) return -1;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr.get(i),max);
            sum+=arr.get(i);
        }
        int low=max, high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(numberofstude(arr, mid, n)<=m){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}
     */
    
}
