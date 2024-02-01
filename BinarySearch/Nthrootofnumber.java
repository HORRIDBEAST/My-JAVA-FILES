public class Nthrootofnumber {
    //brute force
    /* 
    public class Solution {
        public static long fuck(int b, int exp) {
        long  ans = 1;
        long base = b;
        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans = ans * base;
            } else {
                exp /= 2;
                base = base * base;
            }
        }
        return ans;
    }

    public static int NthRoot(int n, int m) {
        for(int i=1;i<=m;i++){
            long val=fuck(i,n);
            if(val==(long)m) return i;
            else if(val>=(long)m) break;
        }
        return -1;
    }
}
*/
//optinal solution
/*
 * //return 1 if ==m
//return 2 if >m
//return 0 if <m

public class Solution {
        public static int fuck(int mid, int n,int m) {
            long ans=1;
            for(int i=1;i<=n;i++){
                ans*=mid;
                if(ans>m) return 2;
            }
        if (ans==m) return 1;
        return 0; 
    }

    public static int NthRoot(int n, int m) {
        int low=1,high=m;

        while(low<=high){
            int mid=(low+high)/2;
            if(fuck(mid,n,m)==1) return mid;
            else if(fuck(mid,n,m)==2) high=mid-1;
            else low=mid+1;
             }
        return -1;
    }
}

 */
}
