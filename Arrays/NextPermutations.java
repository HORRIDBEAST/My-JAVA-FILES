public class NextPermutations {
    //most optimal - leetcode
    class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ans[]=new int [n];
        int index=-1;
        int ind2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){ 
            index=i;
            break;
        }
        }
        if(index==-1) reverse(nums,0);
        else{
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[index]){
                ind2=i;
                break;
            }
        }
       swap(nums,index,ind2);
       reverse(nums,index+1);
            }
    }
            void swap(int []a,int i,int j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            void reverse (int []a,int s){
                int i=s;
                int n=a.length-1;
                while(i<n){
                    swap(a,i,n);
                i++;
                n--;
                }
            }

            //most optimal - codeing ninjas
            import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(permutation);
            return permutation;
        }

        for (int i = n - 1; i > index; i--) {
            if (permutation.get(i) > permutation.get(index)) {
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(index));
                permutation.set(index, temp);
                break;
            }
        }
        Collections.reverse(permutation.subList(index + 1, n));
        return permutation;
    }
}

}
}
