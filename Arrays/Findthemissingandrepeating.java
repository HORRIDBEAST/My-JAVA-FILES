public class Findthemissingandrepeating {
    //brute force 
    /* 
    public class Solution {
        public static int[] findMissingRepeatingNumbers(int[] a) {
            int n = a.length;
            int ans[] = new int[2];
            int rep = -1, mis = -1;
    
            for (int i = 1; i <= n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] == i) count++;
                }
                if (count == 2) rep = i;
                else if (count == 0) mis = i;
    
                if (rep != -1 && mis != -1) break;
            }
            ans[0] = rep;
            ans[1] = mis;
            return ans;
        }
    }

    */
    //better -using hash array
    /* 
    public class Solution {
        public static int[] findMissingRepeatingNumbers(int[] a) {
            int n = a.length;
            int hash[]=new int[n+1];
            int ans[] = new int[2];
            int rep = -1, mis = -1;
    
            for(int i=0;i<n;i++){
                hash[a[i]]++;
            }
    
            for (int i =1 ; i <= n; i++) {
               if(hash[i]==2) rep=i;
               else if(hash[i]==0) mis=i;
                if (rep != -1 && mis != -1) break;
            }
            ans[0] = rep;
            ans[1] = mis;
            return ans;
        }
    }
    */
    //Optimal 1-BY maths
    public class Solution {
        public static int[] findMissingRepeatingNumbers(int[] a) {
            int n = a.length;
            // let x be the number that appears twice and y be the number that appears 0 times
            int ans[] = new int[2];
            long Sn = (n * (n + 1)) / 2;
            long S2n = ((n + 1) * (2 * n + 1) * n) / 6;
            long an = 0;
            long a2n = 0;
    
            for (int i = 0; i < n; i++) {
                an += a[i];
                a2n += (long) Math.pow(a[i], 2);
            }
            long v1 = an - Sn; // x - y
            long v2 = a2n - S2n; // x2 - y2
            v2 = v2 / v1; // gives us x + y
            long x = (v1 + v2) / 2; // gives us x
            long y =  x -v1;
            ans[0] = (int) x;
            ans[1] = (int) y;
            return ans;
        }
    }
    
}
