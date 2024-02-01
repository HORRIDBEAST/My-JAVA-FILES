public class SearchinSorted2D2 {
    //brute fporce - normal 2 loops
    //better solution - binary search on the entire 1 d arrays
    class Solution {
        public boolean bs(int matrix[],int target){
            int n=matrix.length;
            int low=0,high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(matrix[mid]==target) return true;
                else if(matrix[mid]>target) high=mid-1;
                else low=mid+1;
            }
            return false;
        }
        public boolean searchMatrix(int[][] matrix, int target) {
            int n=matrix.length;
           int m=matrix[0].length;
           for(int i=0;i<n;i++){
               boolean f=bs(matrix[i],target);
               if(f)return true ;
           }
           return false;
        }
    }
    //optimal solution  -BS on 2 d ARRAy
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n=matrix.length;
           int m=matrix[0].length;
           int row=0, col=m-1;
           while(row<n && col>=0){
               if(matrix[row][col]==target) return true;
               else if(matrix[row][col]>target) col--;
               else row++;
           }
           return false;
        }
    }
}
