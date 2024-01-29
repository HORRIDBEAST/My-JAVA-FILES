//BRUTE FORCE-NOT RECOMENDED
/*
class Solution {
    public int majorityElement(int[] nums) {
        int fr[]=new int [nums.length];
        int v=-1;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==(nums[j])){
                    count++;
                    fr[j]=v;
                }
                
            }
            if(fr[i]!=v){
                fr[i]=count;
            }
        }
        int x=0;
            for(int i=0;i<fr.length;i++){
            if(fr[i]!=v && fr[i]>Math.ceil((nums.length)/2)){
              x=nums[i];
            }
            }
           return x;
        }
        
    }
 */
//brute force 2
  public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return v[i];
        }


//using hashing 
/* 
import java.util.*;

public class Solution {
    public static int majorityElement(int[] v) {
        int n = v.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(v[i], map.getOrDefault(v[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}

*/
//better approach
import java.util.*;

class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int cKey=a[0];
        int count=1;
        for(int i=0;i<N;i++){
            if(a[i]==cKey) count++;
            else count--;
            if(count==0){ cKey=a[i];
                count=1;
            }
        }
        count=0;
        for(int val:a){
            if(val==cKey){
                count++;
            }
        }
        if(count>N/2)
        System.out.println(count);
        else System.out.println(-1);

    }
}