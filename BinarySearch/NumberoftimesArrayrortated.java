public class NumberoftimesArrayrortated {
    //brute 
    /*
     * public class Solution {
    public static int findKRotation(int []arr){
       int ind=0;
       int min=Integer.MAX_VALUE;
       int n=arr.length;
       for(int i=0;i<n;i++){
           if(arr[i]<min){
               ind=i;
               min=arr[i];
           }
       }
       return ind;
    }
}
     */
}
//optimal
/*
 * public class Solution {
    public static int findKRotation(int []arr){
        int n=arr.length;
            int ans=Integer.MAX_VALUE;
            int index=-1;
            int low=0,high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[low]<=arr[high]){
                    if(arr[low]<ans){
                        ans=arr[low];
                        index=low;
                    }
                    break;
                }
                if(arr[low]<=arr[mid]){
                     if(arr[low]<ans){
                        ans=arr[low];
                        index=low;
                    }
                    low=mid+1;
                }
                else{
                     if(arr[mid]<ans){
                        ans=arr[mid];
                        index=mid;
                    }
                    high=mid-1;
                }
            }
            return index;
    }
}
 */