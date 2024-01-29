//BRUTE FIRCE 1
/* 
public class Solution {
    public static String read(int n, int []book, int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if(book[i]+book[j]==target) return "YES";
            }
        }
        return "NO";
    }
}
*/
//BRUTE FORCE VARIANT 2
/*
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
        }
        }
        return ans;
    }
}
 */
//most optimal ,varaint 1-USING HASHSING
/*
 HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";

 */

//most optimal  variant2- USING HASHING
class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sno = target - nums[i];
            if (map.containsKey(sno)) {
                ans[0] = i;
                ans[1] = map.get(sno);
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}


import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("ENTER THE TARGET ELEMENT");
        int target = sc.nextInt();
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int sno = target - a[i];
            if (map.containsKey(sno)) {
                ans[0] = i;
                ans[1] = map.get(sno);
                break;
            }
            map.put(a[i], i);
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
