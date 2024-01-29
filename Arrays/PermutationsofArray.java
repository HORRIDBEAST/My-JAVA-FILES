class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        permuter(nums,0,n-1,n);
    }
    public void permuter(int[] a,int l , int r,int n){
        if(l==r){
            for(int i=0;i<n;i++){
                System.out.print(a[i]);
            }
        System.out.println();
        }
        else{
            for(int i=l;i<=r;i++){
                swap(a,l,i);
                permuter(a,l+1,r,n);
                swap(a,l,i);
            }
        }
    }
    public void swap(int a[],int i ,int j){
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
            }
}