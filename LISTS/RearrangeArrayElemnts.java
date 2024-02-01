public class RearrangeArrayElemnts {
    //brute force
    import java.util.ArrayList;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        int n=a.length;
     ArrayList<Integer> pos=new ArrayList<>();
     ArrayList<Integer> neg=new ArrayList<>();
     for(int i=0;i<n;i++){
         if (a[i]>0) pos.add(a[i]);
         else neg.add(a[i]);
     }
     for(int i=0;i<n/2;i++){
         a[2*i]=pos.get(i);
         a[2*i+1]=neg.get(i);
        }
    return a;

}}
//most optimal
class Solution {
    public int[] rearrangeArray(int[] nums) {
         int n=nums.length;
        int ans[]=new int [n];
        int pin=0,nin=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pin]=nums[i];
                pin+=2;
            }
            else{
                ans[nin]=nums[i];
                nin+=2;
            }
        }
        return ans;
    }
}
}
