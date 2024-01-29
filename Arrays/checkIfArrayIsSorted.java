public class checkIfArrayIsSorted {
    /*
     // Java program to check if an 
// array is sorted and rotated 
// clockwise 
import java.io.*; 

class GFG { 

	// Function to check if an array is 
	// sorted and rotated clockwise 
	static void checkIfSortRotated(int arr[], int n) 
	{ 
		int minEle = Integer.MAX_VALUE; 
		int maxEle = Integer.MIN_VALUE; 

		int minIndex = -1; 

		// Find the minimum element 
		// and it's index 
		for (int i = 0; i < n; i++) { 
			if (arr[i] < minEle) { 
				minEle = arr[i]; 
				minIndex = i; 
			} 
		} 

		boolean flag1 = true; 

		// Check if all elements before 
		// minIndex are in increasing order 
		for (int i = 1; i < minIndex; i++) { 
			if (arr[i] < arr[i - 1]) { 
				flag1 = false; 
				break; 
			} 
		} 

		boolean flag2 = true; 

		// Check if all elements after 
		// minIndex are in increasing order 
		for (int i = minIndex + 1; i < n; i++) { 
			if (arr[i] < arr[i - 1]) { 
				flag2 = false; 
				break; 
			} 
		} 

		// check if the minIndex is 0, i.e the first element 
		// is the smallest , which is the case when array is 
		// sorted but not rotated. 
		if (minIndex == 0) { 
			System.out.print("NO"); 
			return; 
		} 
		// Check if last element of the array 
		// is smaller than the element just 
		// before the element at minIndex 
		// starting element of the array 
		// for arrays like [3,4,6,1,2,5] - not sorted 
		// circular array 
		if (flag1 && flag2 && (arr[n - 1] < arr[0])) 
			System.out.println("YES"); 
		else
			System.out.print("NO"); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int arr[] = { 3, 4, 5, 1, 2 }; 

		int n = arr.length; 

		// Function Call 
		checkIfSortRotated(arr, n); 
	} 
} 


     */


//******************************************************************************************************************************************* */


//optimal solution
public class Solution {
    public boolean check(int[] nums) {
       int count=0;
       int n=nums.length;
       for(int i=0;i<n-1;i++){
           if(nums[i]>nums[i+1]) count++;
       }

       if(count==0) return true;
       else if(count>1) return false;
       else if (nums[0]>=nums[n-1])return true;
       else return false;
    }

}
}
