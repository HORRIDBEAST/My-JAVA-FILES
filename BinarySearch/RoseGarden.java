public class RoseGarden {
    //brute force 
    /*
     * public class Solution {
    public static boolean possible(int index,int a[],int k,int m,int n){
        int cnt=0;
        int noB=0;
        for(int i=0;i<n;i++){
            if(a[i]<=index) cnt++;
            else{ noB+=(cnt/k);
            cnt=0;
        }
    }
    noB+=(cnt/k);
    return noB>=m;
    }
    public static int roseGarden(int[] arr, int r, int b) {
        long v=(long)(r*b);
        
        int n=arr.length;
        if(v>n) return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }

        for(int i=min;i<=max;i++){
            if(possible(i,arr,r,b,n)) return i;
        }
        return -1;
    }
}
     */
        //optimal solution
        public class Solution {
            public static boolean possible(int index,int a[],int k,int m,int n){
                int cnt=0;
                int noB=0;
                for(int i=0;i<n;i++){
                    if(a[i]<=index) cnt++;
                    else{ noB+=(cnt/k);
                    cnt=0;
                }
            }
            noB+=(cnt/k);
            return noB>=m;
            }
            public static int roseGarden(int[] arr, int r, int b) {
                long v=(long)(r*b);
                int ans=-1;
                int n=arr.length;
                if(v>n) return -1;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int i=0;i<n;i++){
                    max=Math.max(max,arr[i]);
                    min=Math.min(min,arr[i]);
                }
        
                int low=min,high=max;
                while(low<=high){
                    int mid=(low+high)/2;
                    if(possible(mid,arr,r,b,n)){
                            ans=mid;
                            high=mid-1;
                    } 
                    else low=mid+1;
                }
                return ans;
            }
        }

    }
