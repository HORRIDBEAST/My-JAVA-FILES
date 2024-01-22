public class secondLargest {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE;
int ans[]=new int[2];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                smax=max;
                 max=a[i];
                 }
            if(min>a[i]){smin=min;
             min=a[i];  
             }
        }
        for(int i=0;i<n;i++){
            if(smin>a[i] && a[i]!=min) smin=a[i];
            if(smax<a[i] && a[i]!=max) smax=a[i];
        }
        ans[0]=smax;
        ans[1]=smin;
    return ans;
    }
}