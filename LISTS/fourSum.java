import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if(i >0 && nums[i]==nums[i-1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
            if(j>i+1 && nums[j]==nums[j-1]) continue;
            twoSum(i,j, nums ,result,target,n);
                    }
                }
            return result;
        }
        public void twoSum(int i , int j , int nums[] ,List<List<Integer>> result, int target,int n){
            int modtarget=target-nums[i]-nums[j];
            int l=j+1,r=n-1;
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum==modtarget){
                    result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    l++;r--;
                    while(l<r && nums[l]==nums[l+1] ) l++;
                    while(l<r && nums[r]==nums[r+1] ) r--;
                }
                else if(sum>modtarget)r--;
                else l++;
            }
        }
    }
//brute force
/*
 * 
 * import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> s = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> t = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            t.sort(null);
                            s.add(t);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(s);
        return ans;
    }
}
//most optimal
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer> > ans = new ArrayList<>();
        int n = nums.length;
       for(int i=0;i<n;i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
           for(int j=i+1;j<n;j++){
               if(j>i+1 && nums[j]==nums[j-1]) continue;
               int k=j+1;
               int l=n-1;
               while(k<l){
                   long sum=nums[i];
                   sum+=nums[j]+nums[k]+nums[l];
                   if(sum==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;l--;
                        while(k<l&& nums[k]==nums[k-1])k++;
                           while(k<l&& nums[l]==nums[l+1])l--;
                   }
                   if(sum<target) k++;
                   else l--;
               }
           }
       }
       return ans;
        
    }
}

 */