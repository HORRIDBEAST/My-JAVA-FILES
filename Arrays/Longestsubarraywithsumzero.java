public class Longestsubarraywithsumzero {
    //brute force
    /*
     * public class Solution {
static int solve(int[] a){
	int  max = 0;
	for(int i = 0; i < a.length; ++i){
		int sum = 0;
		for(int j = i; j < a.length; ++j){
			sum += a[j];
			if(sum == 0){
				max = Math.max(max, j-i+1);
			}
		}
	}
	return max;
   }
     */

    //most optimal
    /*
     * import java.util.HashMap;
public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int len=0;
        int n=arr.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==0){
                len=i+1;
            }
            else{
                if(map.get(sum)!=null){
                    len=Math.max(len,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }

        }
        return len;
    }
}
     */
}
