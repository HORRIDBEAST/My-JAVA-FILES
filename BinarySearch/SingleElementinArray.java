//brute force
/* 

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int n=arr.size();
        int ans=-1;
        for(int i=0;i<n;i++){
            int count=0;
            int ele=arr.get(i);
            for(int j=0;j<n;j++){
                if(arr.get(j)==ele) count++;
            }
            if(count==1) ans=arr.get(i);
        }
        return ans;
    }
}
*/
//optimal solution
/*
 * class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        if (n == 1) {
            return nums[0];
        }
        
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        
        if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1; // If no single non-duplicate found
    }
}

 */