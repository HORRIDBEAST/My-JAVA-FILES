public class Solution {
    public static int upperBound(int []arr, int x, int n){
       int answer=n;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                answer=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return answer;
    }
}
