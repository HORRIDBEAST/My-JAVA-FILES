public class SearchInt2DArray {
    //brute force - mi kelay
    /*
     * import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        boolean ans=false;
        int rows=mat.size();
        int col=mat.get(0).size();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(mat.get(i).get(j)==target)
                { ans=true;
                break;
                }
            }
        }
         return ans;
    }
}

     */
    // better - binary search on row of the matrix
    import java.util.ArrayList;
public class Solution {
    public static boolean binarySearch(ArrayList<Integer> nums, int target) {
        int n = nums.size(); //size of the array
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) == target) return true;
            else if (target > nums.get(mid)) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        boolean ans=false;
        int rows=mat.size();
        int col=mat.get(0).size();
        for(int i=0;i<rows;i++){
            if(mat.get(i).get(0)<=target && target<=mat.get(i).get(col-1) )
            return binarySearch(mat.get(i),target);
        }
         return ans;
    }
}
//optimal-binary search on entire 2 d matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row=matrix.length;
       int col=matrix[0].length;
       int low=0,high=row*col -1;
       while(low<=high){
           int mid=(low+high)/2;
           int r=mid/col,c=mid%col;
           if(matrix[r][c]==target) return true;
           else if(matrix[r][c]<target) low=mid+1;
           else high=mid-1;
       }
       return false;
    }
}
}
