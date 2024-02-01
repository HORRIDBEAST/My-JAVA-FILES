
    //brute force
    /*
     * import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
       int n=arr.length;
       List<List<Integer>> ans=new ArrayList<>();
       int b=arr[0].length;
       for(int i=0;i<n;i++){
           int start=arr[i][0];
           int end=arr[i][1];
           if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)) continue;

           for(int j=i+1;j<n;j++){
               if(arr[j][0]<=end){
                   end=Math.max(end,arr[j][1]);
               }
               else break;
           }
           ans.add(Arrays.asList(start,end));
       }
       return ans;
    }
}
     */

//optimal --single iteration
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingsubIntervals {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        int b = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (!ans.isEmpty() && arr[i][0] <= ans.get(ans.size() - 1).get(1)) {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            } else {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
        }
        return ans;
    }
}
