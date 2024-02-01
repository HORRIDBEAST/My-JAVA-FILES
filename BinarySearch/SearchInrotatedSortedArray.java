public class SearchInrotatedSortedArray {
    //linear seach
    /*
     * import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int nas=-1;
        for(int i=0;i<n;i++){
            if(arr.get(i)==k) nas=i;
        }
        return nas;
    }
}
     */
    //optimal - check if left sortedd or right sorted
    import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int nas=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==k){
                nas=mid;
            }
            //left sorted
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid)) high=mid-1;
                else low=mid+1; 
            }
            //right sorted
            else{
                if(arr.get(mid)<=k && k<=arr.get(high)) low=mid+1;
                else high=mid-1; 
            }
        }
        return nas;
    }
}
}
