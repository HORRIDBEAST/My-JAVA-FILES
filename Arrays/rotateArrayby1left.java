public class rotateArrayby1left {
    //brute force
    /* 
     static int[] rotateArray(int[] arr, int n) {
        int temp[]=new int[n];
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        return temp;
    }
    */
    //optimal
     static int[] rotateArray(int[] arr, int n) {
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        return arr;
    }
}
