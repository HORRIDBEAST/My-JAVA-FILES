public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    //using hashmap
    import java.util.HashMap;

public class Solution {
    public static int getSingleElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return -1;
    }
}


}
