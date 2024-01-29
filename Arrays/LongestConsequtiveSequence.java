// public class LongestConsequtiveSequence {
//     //brute force - gives TLE
//     public class Solution {
//     public static boolean linearSeacrg(int a[],int ele ){
//         int n=a.length;
//         for(int i=0;i<n;i++){
//             if(a[i]==ele) return true;
//         }
//         return false;
//     }
//     public static int longestSuccessiveElements(int []a) {
//       int n=a.length;
      
//       int ans=0;
//       for(int i=0;i<n;i++){
//           int x=a[i];
//           int c=1;
//           while(linearSeacrg(a,x+1)==true){
//               x=x+1;
//               c=c+1;
//           }
//           ans=Math.max(c, ans);
//       }
//       return ans;
//     }
// }
//optimal - using set
import java.util.HashSet;

public class Solution {
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;
        int ans = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}

}
