public class SmallestDivisorgivenThreshold {
    //brute force


    //optimal solution
    /*
     * class Solution {
    public static boolean possiblesum(int index, int a[], int n, int threshold) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (a[i] + index - 1) / index;  // Increment by the division, not the ceiling
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int ans = -1;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int low = 1, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possiblesum(mid, nums, n, threshold)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}

     */
    
}
