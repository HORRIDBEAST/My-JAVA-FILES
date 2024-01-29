import java.util.*;
import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("ENTER THE TARGET ELEMENT");
        int target = sc.nextInt();
        Arrays.sort(a);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                int j = i + 1;
                int k = N - 1;
                int tt = target - a[i];
                while (j < k) {
                    if (a[j] + a[k] == tt) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        while (j < k && a[j] == a[j + 1]) j++;
                        while (j < k && a[k] == a[k - 1]) k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] > target) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
    }
}
//brut force e
/*
import java.util.*;
public class Solution {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        
        Set<List<Integer>> s = new HashSet<>();
        // check all possible triplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        s.add(temp);
                    }
                }
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(s);
        return ans;
    }
}
 */
//better approach
/*
 *  import java.util.*;
public class Solution {
    public static List< List < Integer > > triplet(int n, int []arr) {
        Set<List<Integer>> s=new HashSet();
     
        for(int i=0;i<n;i++){
            Set<Integer> newset=new HashSet<>();
            for(int j=i+1;j<n;j++){
               int target=-(arr[i]+arr[j]);
               if(newset.contains(target)){
                   List<Integer> temp= Arrays.asList(arr[i],arr[j],target);
                    temp.sort(null);
                    s.add(temp);
               }
               newset.add(arr[j]);
            }
        }
           List<List<Integer>> l=new ArrayList<>(s);
        return l;
    }
}
 */